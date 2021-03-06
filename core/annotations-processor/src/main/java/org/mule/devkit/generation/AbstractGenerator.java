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

package org.mule.devkit.generation;

import org.mule.devkit.GeneratorContext;
import org.mule.devkit.model.code.CodeModel;

public abstract class AbstractGenerator implements Generator {

    protected GeneratorContext context;

    protected abstract boolean shouldGenerate(DevKitTypeElement typeElement);

    protected abstract void doGenerate(DevKitTypeElement typeElement) throws GenerationException;

    @Override
    public final void generate(DevKitTypeElement typeElement, GeneratorContext context) throws GenerationException {
        this.context = context;
        if (shouldGenerate(typeElement)) {
            doGenerate(typeElement);
        }
    }

    protected CodeModel getCodeModel() {
        return context.getCodeModel();
    }
}