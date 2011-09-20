/**
 * Mule Development Kit
 * Copyright 2010-2011 (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mule.devkit.utils;

import org.mule.api.NestedProcessor;
import org.mule.api.annotations.oauth.OAuthAccessToken;
import org.mule.api.annotations.oauth.OAuthAccessTokenSecret;
import org.mule.api.annotations.param.InboundHeaders;
import org.mule.api.annotations.param.InvocationHeaders;
import org.mule.api.annotations.param.OutboundHeaders;
import org.mule.api.annotations.param.Payload;
import org.mule.api.callback.InterceptCallback;
import org.mule.api.callback.SourceCallback;
import org.mule.devkit.generation.spring.SchemaTypeConversion;

import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Types;
import javax.xml.bind.annotation.XmlType;
import java.util.Arrays;
import java.util.List;

public final class TypeMirrorUtils {
    private static final List<Class<?>> PARAMETER_TYPES_TO_IGNORE = Arrays.<Class<?>>asList(SourceCallback.class, InterceptCallback.class);
    private static final List<Class<? extends java.lang.annotation.Annotation>> PARAMETERS_ANNOTATIONS_TO_IGNORE =
            Arrays.asList(InboundHeaders.class, InvocationHeaders.class, OutboundHeaders.class, Payload.class, OAuthAccessToken.class, OAuthAccessTokenSecret.class);

    private Types types;

    public TypeMirrorUtils(Types types) {
        this.types = types;
    }

    public boolean isTransferObject(TypeMirror type) {
        if (SchemaTypeConversion.isSupported(type.toString())) {
            return false;
        }

        if (isXmlType(type)) {
            return false;
        }

        if (type.getKind() != TypeKind.DECLARED) {
            return false;
        }

        DeclaredType declaredType = (DeclaredType) type;
        TypeElement typeElement = (TypeElement) ((DeclaredType) type).asElement();

        // only interfaces can be transfer objects
        if( typeElement.getKind() != ElementKind.INTERFACE ) {
            return false;
        }

        // generic interfaces not supported
        if (typeElement.getTypeParameters().size() > 0) {
            return false;
        }

        // we do not support interfaces that extend other interfaces
        if (typeElement.getInterfaces().size() > 0) {
            return false;
        }

        // if its no public cannot be used
        if (!typeElement.getModifiers().contains(Modifier.PUBLIC)) {
            return false;
        }

        return true;
    }

    public boolean isXmlType(TypeMirror type) {
        if (type.getKind() == TypeKind.DECLARED) {

            DeclaredType declaredType = (DeclaredType) type;
            XmlType xmlType = declaredType.asElement().getAnnotation(XmlType.class);

            if (xmlType != null) {
                return true;
            }
        }

        return false;
    }

    public boolean isCollection(TypeMirror type) {
        return isArrayOrList(type) || isMap(type);
    }

    public boolean isNestedProcessor(TypeMirror type) {
        if( type.toString().contains(NestedProcessor.class.getName()) )
            return true;

        if (type.toString().contains(java.util.List.class.getName())) {
            DeclaredType variableType = (DeclaredType) type;
            java.util.List<? extends TypeMirror> variableTypeParameters = variableType.getTypeArguments();
            if( variableTypeParameters.size() == 0 )
                return false;

            if( variableTypeParameters.get(0).toString().contains(NestedProcessor.class.getName()) )
                return true;
        }

        return false;
    }

    public boolean isArrayOrList(TypeMirror type) {
        if (type.getKind() == TypeKind.ARRAY) {
            return true;
        }

        if (type.toString().contains(java.util.List.class.getName())) {
            return true;
        }

        List<? extends TypeMirror> inherits = types.directSupertypes(type);
        for (TypeMirror inherit : inherits) {
            if (isArrayOrList(inherit)) {
                return true;
            }
        }

        return false;
    }

    public boolean isMap(TypeMirror type) {
        if (type.toString().contains(java.util.Map.class.getName())) {
            return true;
        }

        List<? extends TypeMirror> inherits = types.directSupertypes(type);
        for (TypeMirror inherit : inherits) {
            if (isMap(inherit)) {
                return true;
            }
        }

        return false;
    }

    public boolean isEnum(TypeMirror type) {
        if (type.toString().contains(Enum.class.getName())) {
            return true;
        }

        List<? extends TypeMirror> inherits = types.directSupertypes(type);
        for (TypeMirror inherit : inherits) {
            if (isEnum(inherit)) {
                return true;
            }
        }

        return false;
    }

    public boolean ignoreParameter(VariableElement variable) {
        String variableType = variable.asType().toString();
        for (Class<?> typeToIgnore : PARAMETER_TYPES_TO_IGNORE) {
            if (variableType.contains(typeToIgnore.getName()))
                return true;
        }
        for (Class<? extends java.lang.annotation.Annotation> annotationToIgnore : PARAMETERS_ANNOTATIONS_TO_IGNORE) {
            if (variable.getAnnotation(annotationToIgnore) != null) {
                return true;
            }
        }
        return false;
    }

}
