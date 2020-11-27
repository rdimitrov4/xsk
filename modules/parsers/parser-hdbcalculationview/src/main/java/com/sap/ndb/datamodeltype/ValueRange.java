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


package com.sap.ndb.datamodeltype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.ndb.basemodelbase.EndUserTexts;


/**
 * 
 * 				Models one value of a CDS enumeration
 * 			
 * 
 * <p>Java class for ValueRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="highValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endUserTexts" type="{http://www.sap.com/ndb/BaseModelBase.ecore}EndUserTexts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueRange", propOrder = {
    "value",
    "highValue",
    "endUserTexts"
})
public class ValueRange {

    @XmlElement(required = true)
    protected String value;
    protected String highValue;
    protected EndUserTexts endUserTexts;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the highValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighValue() {
        return highValue;
    }

    /**
     * Sets the value of the highValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighValue(String value) {
        this.highValue = value;
    }

    /**
     * Gets the value of the endUserTexts property.
     * 
     * @return
     *     possible object is
     *     {@link EndUserTexts }
     *     
     */
    public EndUserTexts getEndUserTexts() {
        return endUserTexts;
    }

    /**
     * Sets the value of the endUserTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndUserTexts }
     *     
     */
    public void setEndUserTexts(EndUserTexts value) {
        this.endUserTexts = value;
    }

}
