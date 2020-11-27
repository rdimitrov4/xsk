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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NodeStyle"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LEVEL_NAME"/&gt;
 *     &lt;enumeration value="NAME_ONLY"/&gt;
 *     &lt;enumeration value="NAME_PATH"/&gt;
 *     &lt;enumeration value="LEVEL_NAME_ENFORCED"/&gt;
 *     &lt;enumeration value="NAME_PATH_ENFORCED"/&gt;
 *     &lt;enumeration value="NAME_ONLY_ENFORCED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NodeStyle")
@XmlEnum
public enum NodeStyle {


    /**
     * 
     * 						(default) the unique node ID is composed by level name and node name, for example "[Level 2].[B2]".
     * 					
     * 
     */
    LEVEL_NAME,

    /**
     * 
     * 						The result set value / node name is taken directly without any further decoration, for example "B2".
     * 					
     * 
     */
    NAME_ONLY,

    /**
     * 
     * 						the unique node ID is composed by the result node name and the names of all ancestors apart from the (single physical) 
     * 						root node. For example "[A1].[B2]" 	Please be aware that the value of this parameter affects which hierarchy source data is
     * 						accepted as valid. 	For example, a leveled time hierarchy year / month / day results in unique and therefore valid node IDs 
     * 						when choosing 	the "namePath" node style (e.g., "[2012].[Feb].[08]" and "[2011].[Feb].[08]"), whereas the nodeStyles "nameOnly" or 	
     * 						"levelName" lead to a "duplicate successor node ID" source data error (both times node IDs "08" or "[day].[08]").  
     * 						For the MDX handling the styles namePath and levelName are overwritten in certain cases by the engine during processing. 
     * 					
     * 
     */
    NAME_PATH,

    /**
     * 
     * 						Same behavior as "LEVEL_NAME", but never overwritten by the engine. 
     * 					
     * 
     */
    LEVEL_NAME_ENFORCED,

    /**
     * 
     * 						Same behavior as "NAME_PATH", but never overwritten by the engine. The overwirte behavior for 
     * 						LEVEL_NAME, NAME_PATH remains, but for new models we don't offer these values anymore.
     * 					
     * 
     */
    NAME_PATH_ENFORCED,

    /**
     * 
     * 						Same behavior as "NAME_ONLY", but never overwritten by the engine (only introduced with HANA2 SP02).
     * 					
     * 
     */
    NAME_ONLY_ENFORCED;

    public String value() {
        return name();
    }

    public static NodeStyle fromValue(String v) {
        return valueOf(v);
    }

}
