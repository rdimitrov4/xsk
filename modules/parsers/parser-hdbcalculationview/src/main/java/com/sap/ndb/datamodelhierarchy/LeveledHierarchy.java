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


package com.sap.ndb.datamodelhierarchy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.ndb.basemodelbase.NodeStyle;


/**
 * 
 * 				A Leveled Hierarchy is defined through a list of levels. Each level is the combination of a Level-Number and a reference
 * 				to an Element of the Entity. An example of a	leveled hierarchy is time: days, months and years
 * 			
 * 
 * <p>Java class for LeveledHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeveledHierarchy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/DataModelHierarchy.ecore}InlineHierarchy"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="level" type="{http://www.sap.com/ndb/DataModelHierarchy.ecore}Level" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nodeStyle" type="{http://www.sap.com/ndb/BaseModelBase.ecore}NodeStyle" /&gt;
 *       &lt;attribute name="stepParentNodeID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeveledHierarchy", propOrder = {
    "level"
})
public class LeveledHierarchy
    extends InlineHierarchy
{

    @XmlElement(required = true)
    protected List<Level> level;
    @XmlAttribute(name = "nodeStyle")
    protected NodeStyle nodeStyle;
    @XmlAttribute(name = "stepParentNodeID")
    protected String stepParentNodeID;

    /**
     * Gets the value of the level property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the level property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Level }
     * 
     * 
     */
    public List<Level> getLevel() {
        if (level == null) {
            level = new ArrayList<Level>();
        }
        return this.level;
    }

    /**
     * Gets the value of the nodeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link NodeStyle }
     *     
     */
    public NodeStyle getNodeStyle() {
        return nodeStyle;
    }

    /**
     * Sets the value of the nodeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeStyle }
     *     
     */
    public void setNodeStyle(NodeStyle value) {
        this.nodeStyle = value;
    }

    /**
     * Gets the value of the stepParentNodeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepParentNodeID() {
        return stepParentNodeID;
    }

    /**
     * Sets the value of the stepParentNodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepParentNodeID(String value) {
        this.stepParentNodeID = value;
    }

}
