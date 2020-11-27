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


package com.sap.ndb.basemodelbase;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JoinType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JoinType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="referential"/&gt;
 *     &lt;enumeration value="inner"/&gt;
 *     &lt;enumeration value="leftOuter"/&gt;
 *     &lt;enumeration value="rightOuter"/&gt;
 *     &lt;enumeration value="fullOuter"/&gt;
 *     &lt;enumeration value="textTable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "JoinType")
@XmlEnum
public enum JoinType {


    /**
     * 
     * 						Join type referential integrity means for each row in the left table there is a corresponding row in the right table.
     * 						If this join type is selected the engine can better optimize the queries, because the join can be completely 
     * 						ignored if no fields are requested from the joined table.
     * 					
     * 
     */
    @XmlEnumValue("referential")
    REFERENTIAL("referential"),
    @XmlEnumValue("inner")
    INNER("inner"),
    @XmlEnumValue("leftOuter")
    LEFT_OUTER("leftOuter"),
    @XmlEnumValue("rightOuter")
    RIGHT_OUTER("rightOuter"),
    @XmlEnumValue("fullOuter")
    FULL_OUTER("fullOuter"),

    /**
     * 
     * 						TextTable indicates a join with a text table (as right table) having language as additional key. 
     * 						During runtime the language key is filled with the user/logon language
     * 					
     * 
     */
    @XmlEnumValue("textTable")
    TEXT_TABLE("textTable");
    private final String value;

    JoinType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JoinType fromValue(String v) {
        for (JoinType c: JoinType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
