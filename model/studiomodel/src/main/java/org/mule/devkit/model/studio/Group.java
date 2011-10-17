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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="regexp" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}AttributeType"/>
 *           &lt;element name="encoding" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}encodingType"/>
 *           &lt;element name="modeSwitch" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}ModeType"/>
 *           &lt;element name="string" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}StringAttributeType"/>
 *           &lt;element name="password" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}StringAttributeType"/>
 *           &lt;element name="globalRef" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}NewType"/>
 *           &lt;element name="long" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}LongType"/>
 *           &lt;element name="list" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}AttributeType"/>
 *           &lt;element name="integer" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}IntegerType"/>
 *           &lt;element name="boolean" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}Booleantype"/>
 *           &lt;element name="transientBoolean" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}Booleantype"/>
 *           &lt;element name="classname" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}ClassType"/>
 *           &lt;element name="name" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}AttributeType"/>
 *           &lt;element name="url" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}AttributeType"/>
 *           &lt;element name="childElement" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}NestedElementReference"/>
 *           &lt;element name="text" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}TextType"/>
 *           &lt;element name="path" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}AttributeType"/>
 *           &lt;element name="file" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}AttributeType"/>
 *           &lt;element name="enum" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}EnumType"/>
 *           &lt;element name="expression" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}ExpressionAttributeType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mode" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}NewSimpleType" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="versions" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="topAnchor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bottomAnchor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="caption" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", propOrder = {
    "regexpOrEncodingOrModeSwitch"
})
public class Group {

    @XmlElementRefs({
        @XmlElementRef(name = "string", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "list", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "classname", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "integer", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "url", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "modeSwitch", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "childElement", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "regexp", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "enum", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "transientBoolean", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "password", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "text", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "file", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "path", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "expression", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "encoding", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "boolean", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "name", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "globalRef", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class),
        @XmlElementRef(name = "long", namespace = "http://www.mulesoft.org/schema/mule/tooling.attributes", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends AttributeType>> regexpOrEncodingOrModeSwitch;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "mode")
    protected NewSimpleType mode;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "versions")
    protected String versions;
    @XmlAttribute(name = "topAnchor")
    protected String topAnchor;
    @XmlAttribute(name = "bottomAnchor")
    protected String bottomAnchor;
    @XmlAttribute(name = "caption", required = true)
    protected String caption;

    /**
     * Gets the value of the regexpOrEncodingOrModeSwitch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regexpOrEncodingOrModeSwitch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegexpOrEncodingOrModeSwitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link StringAttributeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttributeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassType }{@code >}
     * {@link JAXBElement }{@code <}{@link ModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttributeType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntegerType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttributeType }{@code >}
     * {@link JAXBElement }{@code <}{@link NestedElementReference }{@code >}
     * {@link JAXBElement }{@code <}{@link EnumType }{@code >}
     * {@link JAXBElement }{@code <}{@link Booleantype }{@code >}
     * {@link JAXBElement }{@code <}{@link StringAttributeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttributeType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttributeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExpressionAttributeType }{@code >}
     * {@link JAXBElement }{@code <}{@link EncodingType }{@code >}
     * {@link JAXBElement }{@code <}{@link Booleantype }{@code >}
     * {@link JAXBElement }{@code <}{@link AttributeType }{@code >}
     * {@link JAXBElement }{@code <}{@link LongType }{@code >}
     * {@link JAXBElement }{@code <}{@link NewType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AttributeType>> getRegexpOrEncodingOrModeSwitch() {
        if (regexpOrEncodingOrModeSwitch == null) {
            regexpOrEncodingOrModeSwitch = new ArrayList<JAXBElement<? extends AttributeType>>();
        }
        return this.regexpOrEncodingOrModeSwitch;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link NewSimpleType }
     *     
     */
    public NewSimpleType getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewSimpleType }
     *     
     */
    public void setMode(NewSimpleType value) {
        this.mode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the versions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersions() {
        return versions;
    }

    /**
     * Sets the value of the versions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersions(String value) {
        this.versions = value;
    }

    /**
     * Gets the value of the topAnchor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopAnchor() {
        return topAnchor;
    }

    /**
     * Sets the value of the topAnchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopAnchor(String value) {
        this.topAnchor = value;
    }

    /**
     * Gets the value of the bottomAnchor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottomAnchor() {
        return bottomAnchor;
    }

    /**
     * Sets the value of the bottomAnchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottomAnchor(String value) {
        this.bottomAnchor = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

}
