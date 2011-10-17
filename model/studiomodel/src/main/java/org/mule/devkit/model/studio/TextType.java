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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.14 at 10:40:36 AM CDT 
//


package org.mule.devkit.model.studio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mulesoft.org/schema/mule/tooling.attributes}AttributeType">
 *       &lt;attribute name="isToElement" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nestedName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wrapWithCDATA" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextType")
public class TextType
    extends AttributeType
{

    @XmlAttribute(name = "isToElement")
    protected Boolean isToElement;
    @XmlAttribute(name = "language")
    protected String language;
    @XmlAttribute(name = "nestedName")
    protected String nestedName;
    @XmlAttribute(name = "wrapWithCDATA")
    protected Boolean wrapWithCDATA;

    /**
     * Gets the value of the isToElement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsToElement() {
        return isToElement;
    }

    /**
     * Sets the value of the isToElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsToElement(Boolean value) {
        this.isToElement = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the nestedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNestedName() {
        return nestedName;
    }

    /**
     * Sets the value of the nestedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNestedName(String value) {
        this.nestedName = value;
    }

    /**
     * Gets the value of the wrapWithCDATA property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWrapWithCDATA() {
        return wrapWithCDATA;
    }

    /**
     * Sets the value of the wrapWithCDATA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWrapWithCDATA(Boolean value) {
        this.wrapWithCDATA = value;
    }

}
