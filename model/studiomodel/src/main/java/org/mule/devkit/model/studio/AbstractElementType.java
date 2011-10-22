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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for AbstractElementType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="AbstractElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.mulesoft.org/schema/mule/tooling.attributes}attribute-category"/>
 *           &lt;element name="required-set-alternatives" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}AlternativesType"/>
 *           &lt;element name="fixedAttribute" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}FixedAttributeType"/>
 *           &lt;element name="alwaysAdd" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}AlwaysAdd"/>
 *           &lt;element name="wrap-in-attrs" type="{http://www.mulesoft.org/schema/mule/tooling.attributes}Attributes"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="wrapIn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="allowAny" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="versions" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="aliasId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="caption" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="icon" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="doNotInherit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="embedIn" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="image" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="abstract" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="extends" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractElementType", propOrder = {
        "attributeCategoryOrRequiredSetAlternativesOrFixedAttribute"
})
@XmlSeeAlso({
        ScopeType.class,
        NestedElementType.class,
        PatternType.class,
        GlobalType.class,
        EndpointType.class
})
public class AbstractElementType {

    @XmlElements({
            @XmlElement(name = "wrap-in-attrs", type = Attributes.class),
            @XmlElement(name = "fixedAttribute", type = FixedAttributeType.class),
            @XmlElement(name = "alwaysAdd", type = AlwaysAdd.class),
            @XmlElement(name = "required-set-alternatives", type = AlternativesType.class),
            @XmlElement(name = "attribute-category", type = AttributeCategory.class)
    })
    protected List<Object> attributeCategoryOrRequiredSetAlternativesOrFixedAttribute;
    @XmlAttribute(name = "wrapIn")
    protected String wrapIn;
    @XmlAttribute(name = "allowAny")
    protected Boolean allowAny;
    @XmlAttribute(name = "versions")
    protected String versions;
    @XmlAttribute(name = "aliasId")
    protected String aliasId;
    @XmlAttribute(name = "caption", required = true)
    protected String caption;
    @XmlAttribute(name = "description", required = true)
    protected String description;
    @XmlAttribute(name = "icon")
    protected String icon;
    @XmlAttribute(name = "localId", required = true)
    protected String localId;
    @XmlAttribute(name = "doNotInherit")
    protected String doNotInherit;
    @XmlAttribute(name = "embedIn")
    @XmlSchemaType(name = "anySimpleType")
    protected String embedIn;
    @XmlAttribute(name = "image")
    protected String image;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "abstract")
    protected Boolean _abstract;
    @XmlAttribute(name = "extends")
    protected String _extends;

    /**
     * Gets the value of the attributeCategoryOrRequiredSetAlternativesOrFixedAttribute property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeCategoryOrRequiredSetAlternativesOrFixedAttribute property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeCategoryOrRequiredSetAlternativesOrFixedAttribute().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Attributes }
     * {@link FixedAttributeType }
     * {@link AlwaysAdd }
     * {@link AlternativesType }
     * {@link AttributeCategory }
     */
    public List<Object> getAttributeCategoryOrRequiredSetAlternativesOrFixedAttribute() {
        if (attributeCategoryOrRequiredSetAlternativesOrFixedAttribute == null) {
            attributeCategoryOrRequiredSetAlternativesOrFixedAttribute = new ArrayList<Object>();
        }
        return this.attributeCategoryOrRequiredSetAlternativesOrFixedAttribute;
    }

    /**
     * Gets the value of the wrapIn property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getWrapIn() {
        return wrapIn;
    }

    /**
     * Sets the value of the wrapIn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWrapIn(String value) {
        this.wrapIn = value;
    }

    /**
     * Gets the value of the allowAny property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isAllowAny() {
        return allowAny;
    }

    /**
     * Sets the value of the allowAny property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAllowAny(Boolean value) {
        this.allowAny = value;
    }

    /**
     * Gets the value of the versions property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getVersions() {
        return versions;
    }

    /**
     * Sets the value of the versions property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVersions(String value) {
        this.versions = value;
    }

    /**
     * Gets the value of the aliasId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getAliasId() {
        return aliasId;
    }

    /**
     * Sets the value of the aliasId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAliasId(String value) {
        this.aliasId = value;
    }

    /**
     * Gets the value of the caption property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the icon property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Gets the value of the localId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLocalId(String value) {
        this.localId = value;
    }

    /**
     * Gets the value of the doNotInherit property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDoNotInherit() {
        return doNotInherit;
    }

    /**
     * Sets the value of the doNotInherit property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDoNotInherit(String value) {
        this.doNotInherit = value;
    }

    /**
     * Gets the value of the embedIn property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getEmbedIn() {
        return embedIn;
    }

    /**
     * Sets the value of the embedIn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmbedIn(String value) {
        this.embedIn = value;
    }

    /**
     * Gets the value of the image property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Gets the value of the category property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the abstract property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAbstract(Boolean value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the extends property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getExtends() {
        return _extends;
    }

    /**
     * Sets the value of the extends property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExtends(String value) {
        this._extends = value;
    }

}
