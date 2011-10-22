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
 * <p>Java class for NestedElementReference complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="NestedElementReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mulesoft.org/schema/mule/tooling.attributes}AttributeType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="inplace" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="allowMultiple" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="tableUI" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="treeUI" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="allowSubTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="allowedSubTypes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NestedElementReference")
public class NestedElementReference
        extends AttributeType {

    @XmlAttribute(name = "inplace")
    protected Boolean inplace;
    @XmlAttribute(name = "allowMultiple")
    protected Boolean allowMultiple;
    @XmlAttribute(name = "tableUI")
    protected Boolean tableUI;
    @XmlAttribute(name = "treeUI")
    protected Boolean treeUI;
    @XmlAttribute(name = "allowSubTypes")
    protected Boolean allowSubTypes;
    @XmlAttribute(name = "allowedSubTypes")
    protected String allowedSubTypes;

    /**
     * Gets the value of the inplace property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isInplace() {
        return inplace;
    }

    /**
     * Sets the value of the inplace property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setInplace(Boolean value) {
        this.inplace = value;
    }

    /**
     * Gets the value of the allowMultiple property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isAllowMultiple() {
        return allowMultiple;
    }

    /**
     * Sets the value of the allowMultiple property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAllowMultiple(Boolean value) {
        this.allowMultiple = value;
    }

    /**
     * Gets the value of the tableUI property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isTableUI() {
        return tableUI;
    }

    /**
     * Sets the value of the tableUI property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTableUI(Boolean value) {
        this.tableUI = value;
    }

    /**
     * Gets the value of the treeUI property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isTreeUI() {
        return treeUI;
    }

    /**
     * Sets the value of the treeUI property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTreeUI(Boolean value) {
        this.treeUI = value;
    }

    /**
     * Gets the value of the allowSubTypes property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isAllowSubTypes() {
        return allowSubTypes;
    }

    /**
     * Sets the value of the allowSubTypes property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAllowSubTypes(Boolean value) {
        this.allowSubTypes = value;
    }

    /**
     * Gets the value of the allowedSubTypes property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getAllowedSubTypes() {
        return allowedSubTypes;
    }

    /**
     * Sets the value of the allowedSubTypes property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAllowedSubTypes(String value) {
        this.allowedSubTypes = value;
    }

}
