/*
 * Copyright (c) 2019-2020 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2020 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.26 at 10:54:28 AM EET 
//


package com.sap.ndb.datamodelentity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.sap.ndb.datamodelhierarchy.InlineHierarchy;
import com.sap.ndb.datamodeltype.ObjectType;
import com.sap.ndb.datamodeltype.StructureType;


/**
 * 
 * 			Data type including a semantic description. Replaces the ABAP data element in the common and int the meta model 
 * 			
 * 
 * <p>Java class for Entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Entity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/DataModelType.ecore}StructureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inlineHierarchy" type="{http://www.sap.com/ndb/DataModelHierarchy.ecore}InlineHierarchy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="index" type="{http://www.sap.com/ndb/DataModelEntity.ecore}Index" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="partitionSpecification" type="{http://www.sap.com/ndb/DataModelEntity.ecore}PartitionSpecification" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="tableGroup" type="{http://www.sap.com/ndb/DataModelEntity.ecore}TableGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="view" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="tableType" type="{http://www.sap.com/ndb/DataModelEntity.ecore}TableType" /&gt;
 *       &lt;attribute name="historyEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="dataCategory" type="{http://www.sap.com/ndb/DataModelEntity.ecore}DataCategory" /&gt;
 *       &lt;attribute name="dimensionType" type="{http://www.sap.com/ndb/DataModelEntity.ecore}DimensionType" default="STANDARD" /&gt;
 *       &lt;attribute name="defaultMember" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DefaultMember" /&gt;
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="replicationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="hierarchiesSQLEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="objectType" type="{http://www.sap.com/ndb/DataModelType.ecore}ObjectType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity", propOrder = {
    "inlineHierarchy",
    "index",
    "partitionSpecification",
    "tableGroup"
})
public class Entity
    extends StructureType
{

    protected List<InlineHierarchy> inlineHierarchy;
    protected List<Index> index;
    protected List<PartitionSpecification> partitionSpecification;
    protected TableGroup tableGroup;
    @XmlAttribute(name = "readOnly")
    protected Boolean readOnly;
    @XmlAttribute(name = "view")
    protected Boolean view;
    @XmlAttribute(name = "tableType")
    protected TableType tableType;
    @XmlAttribute(name = "historyEnabled")
    protected Boolean historyEnabled;
    @XmlAttribute(name = "dataCategory")
    protected DataCategory dataCategory;
    @XmlAttribute(name = "dimensionType")
    protected DimensionType dimensionType;
    @XmlAttribute(name = "defaultMember")
    protected String defaultMember;
    @XmlAttribute(name = "hidden")
    protected Boolean hidden;
    @XmlAttribute(name = "replicationEnabled")
    protected Boolean replicationEnabled;
    @XmlAttribute(name = "hierarchiesSQLEnabled")
    protected Boolean hierarchiesSQLEnabled;
    @XmlAttribute(name = "objectType")
    protected ObjectType objectType;

    /**
     * Gets the value of the inlineHierarchy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inlineHierarchy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInlineHierarchy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InlineHierarchy }
     * 
     * 
     */
    public List<InlineHierarchy> getInlineHierarchy() {
        if (inlineHierarchy == null) {
            inlineHierarchy = new ArrayList<InlineHierarchy>();
        }
        return this.inlineHierarchy;
    }

    /**
     * Gets the value of the index property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the index property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Index }
     * 
     * 
     */
    public List<Index> getIndex() {
        if (index == null) {
            index = new ArrayList<Index>();
        }
        return this.index;
    }

    /**
     * Gets the value of the partitionSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partitionSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartitionSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartitionSpecification }
     * 
     * 
     */
    public List<PartitionSpecification> getPartitionSpecification() {
        if (partitionSpecification == null) {
            partitionSpecification = new ArrayList<PartitionSpecification>();
        }
        return this.partitionSpecification;
    }

    /**
     * Gets the value of the tableGroup property.
     * 
     * @return
     *     possible object is
     *     {@link TableGroup }
     *     
     */
    public TableGroup getTableGroup() {
        return tableGroup;
    }

    /**
     * Sets the value of the tableGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableGroup }
     *     
     */
    public void setTableGroup(TableGroup value) {
        this.tableGroup = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the view property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isView() {
        return view;
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setView(Boolean value) {
        this.view = value;
    }

    /**
     * Gets the value of the tableType property.
     * 
     * @return
     *     possible object is
     *     {@link TableType }
     *     
     */
    public TableType getTableType() {
        return tableType;
    }

    /**
     * Sets the value of the tableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableType }
     *     
     */
    public void setTableType(TableType value) {
        this.tableType = value;
    }

    /**
     * Gets the value of the historyEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHistoryEnabled() {
        return historyEnabled;
    }

    /**
     * Sets the value of the historyEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHistoryEnabled(Boolean value) {
        this.historyEnabled = value;
    }

    /**
     * Gets the value of the dataCategory property.
     * 
     * @return
     *     possible object is
     *     {@link DataCategory }
     *     
     */
    public DataCategory getDataCategory() {
        return dataCategory;
    }

    /**
     * Sets the value of the dataCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataCategory }
     *     
     */
    public void setDataCategory(DataCategory value) {
        this.dataCategory = value;
    }

    /**
     * Gets the value of the dimensionType property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getDimensionType() {
        if (dimensionType == null) {
            return DimensionType.STANDARD;
        } else {
            return dimensionType;
        }
    }

    /**
     * Sets the value of the dimensionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setDimensionType(DimensionType value) {
        this.dimensionType = value;
    }

    /**
     * Gets the value of the defaultMember property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultMember() {
        return defaultMember;
    }

    /**
     * Sets the value of the defaultMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultMember(String value) {
        this.defaultMember = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidden(Boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the replicationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplicationEnabled() {
        return replicationEnabled;
    }

    /**
     * Sets the value of the replicationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplicationEnabled(Boolean value) {
        this.replicationEnabled = value;
    }

    /**
     * Gets the value of the hierarchiesSQLEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHierarchiesSQLEnabled() {
        return hierarchiesSQLEnabled;
    }

    /**
     * Sets the value of the hierarchiesSQLEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHierarchiesSQLEnabled(Boolean value) {
        this.hierarchiesSQLEnabled = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectType }
     *     
     */
    public ObjectType getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectType }
     *     
     */
    public void setObjectType(ObjectType value) {
        this.objectType = value;
    }

}
