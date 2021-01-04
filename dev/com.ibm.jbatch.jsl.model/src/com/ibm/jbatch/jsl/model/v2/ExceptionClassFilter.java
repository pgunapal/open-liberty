/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vIBM 2.2.3-11/28/2011 06:21 AM(foreman)-
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.06.11 at 05:49:00 PM EDT
//

package com.ibm.jbatch.jsl.model.v2;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ExceptionClassFilter complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExceptionClassFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="include" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="exclude" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionClassFilter", propOrder = {
                                                      "includeList",
                                                      "excludeList"
})
@Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
public class ExceptionClassFilter extends com.ibm.jbatch.jsl.model.ExceptionClassFilter {

    @XmlElement(name = "include")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected List<ExceptionClassFilter.Include> includeList;
    @XmlElement(name = "exclude")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected List<ExceptionClassFilter.Exclude> excludeList;

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public List<ExceptionClassFilter.Include> getIncludeList() {
        if (includeList == null) {
            includeList = new ArrayList<ExceptionClassFilter.Include>();
        }
        return this.includeList;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public List<ExceptionClassFilter.Exclude> getExcludeList() {
        if (excludeList == null) {
            excludeList = new ArrayList<ExceptionClassFilter.Exclude>();
        }
        return this.excludeList;
    }

    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *       &lt;/sequence>
     *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public static class Exclude extends com.ibm.jbatch.jsl.model.ExceptionClassFilter.Exclude {

        @XmlAttribute(name = "class", required = true)
        @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
        protected String clazz;

        /** {@inheritDoc} */
        @Override
        @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
        public String getClazz() {
            return clazz;
        }

        /** {@inheritDoc} */
        @Override
        @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
        public void setClazz(String value) {
            this.clazz = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *       &lt;/sequence>
     *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public static class Include extends com.ibm.jbatch.jsl.model.ExceptionClassFilter.Include {

        @XmlAttribute(name = "class", required = true)
        @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
        protected String clazz;

        /** {@inheritDoc} */
        @Override
        @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
        public String getClazz() {
            return clazz;
        }

        /** {@inheritDoc} */
        @Override
        @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
        public void setClazz(String value) {
            this.clazz = value;
        }

    }

}
