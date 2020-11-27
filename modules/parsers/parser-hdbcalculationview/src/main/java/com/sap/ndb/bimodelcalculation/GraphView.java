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


package com.sap.ndb.bimodelcalculation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.ndb.datamodelgraph.GetNeighborhoodParameterization;
import com.sap.ndb.datamodelgraph.GetShortestPathParameterization;
import com.sap.ndb.datamodelgraph.GetShortestPathsParameterization;
import com.sap.ndb.datamodelgraph.GetStronglyConnectedComponents;
import com.sap.ndb.datamodelgraph.GraphAction;
import com.sap.ndb.datamodelgraph.PatternMatching;
import com.sap.ndb.datamodelgraph.ScriptPatternMatching;


/**
 * 
 * 				A view node that contains a graph action
 * 			
 * 
 * <p>Java class for GraphView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraphView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/BiModelCalculation.ecore}Node"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="patternMatching" type="{http://www.sap.com/ndb/DataModelGraph.ecore}PatternMatching"/&gt;
 *         &lt;element name="scriptPatternMatching" type="{http://www.sap.com/ndb/DataModelGraph.ecore}ScriptPatternMatching"/&gt;
 *         &lt;element name="getNeighborhoodParameterization" type="{http://www.sap.com/ndb/DataModelGraph.ecore}GetNeighborhoodParameterization"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="output" type="{http://www.sap.com/ndb/BiModelCalculation.ecore}Output" maxOccurs="2" minOccurs="0"/&gt;
 *           &lt;element name="getShortestPathsParameterization" type="{http://www.sap.com/ndb/DataModelGraph.ecore}GetShortestPathsParameterization"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="getShortestPathParameterization" type="{http://www.sap.com/ndb/DataModelGraph.ecore}GetShortestPathParameterization"/&gt;
 *         &lt;element name="getStronglyConnectedComponents" type="{http://www.sap.com/ndb/DataModelGraph.ecore}GetStronglyConnectedComponents"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="workspace" use="required" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}RepositoryUri" /&gt;
 *       &lt;attribute name="action" use="required" type="{http://www.sap.com/ndb/DataModelGraph.ecore}GraphAction" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraphView", propOrder = {
    "patternMatching",
    "scriptPatternMatching",
    "getNeighborhoodParameterization",
    "output",
    "getShortestPathsParameterization",
    "getShortestPathParameterization",
    "getStronglyConnectedComponents"
})
public class GraphView
    extends Node
{

    protected PatternMatching patternMatching;
    protected ScriptPatternMatching scriptPatternMatching;
    protected GetNeighborhoodParameterization getNeighborhoodParameterization;
    protected List<Output> output;
    protected GetShortestPathsParameterization getShortestPathsParameterization;
    protected GetShortestPathParameterization getShortestPathParameterization;
    protected GetStronglyConnectedComponents getStronglyConnectedComponents;
    @XmlAttribute(name = "workspace", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String workspace;
    @XmlAttribute(name = "action", required = true)
    protected GraphAction action;

    /**
     * Gets the value of the patternMatching property.
     * 
     * @return
     *     possible object is
     *     {@link PatternMatching }
     *     
     */
    public PatternMatching getPatternMatching() {
        return patternMatching;
    }

    /**
     * Sets the value of the patternMatching property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatternMatching }
     *     
     */
    public void setPatternMatching(PatternMatching value) {
        this.patternMatching = value;
    }

    /**
     * Gets the value of the scriptPatternMatching property.
     * 
     * @return
     *     possible object is
     *     {@link ScriptPatternMatching }
     *     
     */
    public ScriptPatternMatching getScriptPatternMatching() {
        return scriptPatternMatching;
    }

    /**
     * Sets the value of the scriptPatternMatching property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScriptPatternMatching }
     *     
     */
    public void setScriptPatternMatching(ScriptPatternMatching value) {
        this.scriptPatternMatching = value;
    }

    /**
     * Gets the value of the getNeighborhoodParameterization property.
     * 
     * @return
     *     possible object is
     *     {@link GetNeighborhoodParameterization }
     *     
     */
    public GetNeighborhoodParameterization getGetNeighborhoodParameterization() {
        return getNeighborhoodParameterization;
    }

    /**
     * Sets the value of the getNeighborhoodParameterization property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetNeighborhoodParameterization }
     *     
     */
    public void setGetNeighborhoodParameterization(GetNeighborhoodParameterization value) {
        this.getNeighborhoodParameterization = value;
    }

    /**
     * Gets the value of the output property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the output property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Output }
     * 
     * 
     */
    public List<Output> getOutput() {
        if (output == null) {
            output = new ArrayList<Output>();
        }
        return this.output;
    }

    /**
     * Gets the value of the getShortestPathsParameterization property.
     * 
     * @return
     *     possible object is
     *     {@link GetShortestPathsParameterization }
     *     
     */
    public GetShortestPathsParameterization getGetShortestPathsParameterization() {
        return getShortestPathsParameterization;
    }

    /**
     * Sets the value of the getShortestPathsParameterization property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetShortestPathsParameterization }
     *     
     */
    public void setGetShortestPathsParameterization(GetShortestPathsParameterization value) {
        this.getShortestPathsParameterization = value;
    }

    /**
     * Gets the value of the getShortestPathParameterization property.
     * 
     * @return
     *     possible object is
     *     {@link GetShortestPathParameterization }
     *     
     */
    public GetShortestPathParameterization getGetShortestPathParameterization() {
        return getShortestPathParameterization;
    }

    /**
     * Sets the value of the getShortestPathParameterization property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetShortestPathParameterization }
     *     
     */
    public void setGetShortestPathParameterization(GetShortestPathParameterization value) {
        this.getShortestPathParameterization = value;
    }

    /**
     * Gets the value of the getStronglyConnectedComponents property.
     * 
     * @return
     *     possible object is
     *     {@link GetStronglyConnectedComponents }
     *     
     */
    public GetStronglyConnectedComponents getGetStronglyConnectedComponents() {
        return getStronglyConnectedComponents;
    }

    /**
     * Sets the value of the getStronglyConnectedComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStronglyConnectedComponents }
     *     
     */
    public void setGetStronglyConnectedComponents(GetStronglyConnectedComponents value) {
        this.getStronglyConnectedComponents = value;
    }

    /**
     * Gets the value of the workspace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkspace() {
        return workspace;
    }

    /**
     * Sets the value of the workspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkspace(String value) {
        this.workspace = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link GraphAction }
     *     
     */
    public GraphAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphAction }
     *     
     */
    public void setAction(GraphAction value) {
        this.action = value;
    }

}
