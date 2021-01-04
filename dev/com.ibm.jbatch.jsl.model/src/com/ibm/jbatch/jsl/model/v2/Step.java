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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.ibm.jbatch.jsl.model.helper.TransitionElement;

/**
 * <p>Java class for Step complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Step">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="properties" type="{https://jakarta.ee/xml/ns/jakartaee}Properties" minOccurs="0"/>
 *         &lt;element name="listeners" type="{https://jakarta.ee/xml/ns/jakartaee}Listeners" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="batchlet" type="{https://jakarta.ee/xml/ns/jakartaee}Batchlet"/>
 *           &lt;element name="chunk" type="{https://jakarta.ee/xml/ns/jakartaee}Chunk"/>
 *         &lt;/choice>
 *         &lt;element name="partition" type="{https://jakarta.ee/xml/ns/jakartaee}Partition" minOccurs="0"/>
 *         &lt;group ref="{https://jakarta.ee/xml/ns/jakartaee}TransitionElements" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="start-limit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="allow-start-if-complete" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="next" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Step", propOrder = {
                                      "properties",
                                      "listeners",
                                      "batchlet",
                                      "chunk",
                                      "partition",
                                      "transitionElements"
})
@Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
/**
 * Modified post-XJC-gen by custom JSR352 RI build logic
 * since we can't seem to get JAXB's XJC to generate
 * elements implementing a common interface.
 *
 * This custom logic adds the interface implementation :
 * implements com.ibm.jbatch.container.jsl.ExecutionElement
 */
public class Step extends com.ibm.jbatch.jsl.model.Step {

    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected JSLProperties properties;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected Listeners listeners;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected Batchlet batchlet;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected Chunk chunk;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected Partition partition;
    @XmlElements({
                   @XmlElement(name = "end", type = End.class),
                   @XmlElement(name = "stop", type = Stop.class),
                   @XmlElement(name = "next", type = Next.class),
                   @XmlElement(name = "fail", type = Fail.class)
    })
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected List<TransitionElement> transitionElements;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected String id;
    @XmlAttribute(name = "start-limit")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected String startLimit;
    @XmlAttribute(name = "allow-start-if-complete")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected String allowStartIfComplete;
    @XmlAttribute(name = "next")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected String nextFromAttribute;

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public JSLProperties getProperties() {
        return properties;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setProperties(com.ibm.jbatch.jsl.model.JSLProperties value) {
        this.properties = (JSLProperties) value;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public Listeners getListeners() {
        return listeners;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setListeners(com.ibm.jbatch.jsl.model.Listeners value) {
        this.listeners = (Listeners) value;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public Batchlet getBatchlet() {
        return batchlet;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setBatchlet(com.ibm.jbatch.jsl.model.Batchlet value) {
        this.batchlet = (Batchlet) value;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public Chunk getChunk() {
        return chunk;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setChunk(com.ibm.jbatch.jsl.model.Chunk value) {
        this.chunk = (Chunk) value;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public Partition getPartition() {
        return partition;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setPartition(com.ibm.jbatch.jsl.model.Partition value) {
        this.partition = (Partition) value;
    }

    /**
     * Gets the value of the transitionElements property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transitionElements property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getTransitionElements().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link End }
     * {@link Stop }
     * {@link Next }
     * {@link Fail }
     *
     *
     */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public List<TransitionElement> getTransitionElements() {
        if (transitionElements == null) {
            transitionElements = new ArrayList<TransitionElement>();
        }
        return this.transitionElements;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public String getId() {
        return id;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setId(String value) {
        this.id = value;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public String getStartLimit() {
        return startLimit;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setStartLimit(String value) {
        this.startLimit = value;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public String getAllowStartIfComplete() {
        return allowStartIfComplete;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setAllowStartIfComplete(String value) {
        this.allowStartIfComplete = value;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public String getNextFromAttribute() {
        return nextFromAttribute;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setNextFromAttribute(String value) {
        this.nextFromAttribute = value;
    }

    /**
     * Copyright 2013 International Business Machines Corp.
     *
     * See the NOTICE file distributed with this work for additional information
     * regarding copyright ownership. Licensed under the Apache License,
     * Version 2.0 (the "License"); you may not use this file except in compliance
     * with the License. You may obtain a copy of the License at
     *
     * http://www.apache.org/licenses/LICENSE-2.0
     *
     * Unless required by applicable law or agreed to in writing, software
     * distributed under the License is distributed on an "AS IS" BASIS,
     * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * See the License for the specific language governing permissions and
     * limitations under the License.
     */
    /*
     * Appended by build tooling.
     */
    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(100);
        buf.append("Step: id=" + id);
        buf.append(", startLimit=" + startLimit);
        buf.append(", allowStartIfComplete=" + allowStartIfComplete);
        buf.append("\nnextFromAttribute =" + nextFromAttribute);
        buf.append("\nTransition elements: \n");
        if (transitionElements == null) {
            buf.append("<none>");
        } else {
            int j = 0;
            for (com.ibm.jbatch.jsl.model.helper.TransitionElement e : transitionElements) {
                buf.append("transition element[" + j + "]:" + e + "\n");
                j++;
            }
        }
        buf.append("\nProperties = " + com.ibm.jbatch.jsl.model.helper.PropertiesToStringHelper.getString(properties));
        buf.append("\n");
        if (batchlet != null) {
            buf.append("Contains batchlet=" + batchlet);
        }
        if (chunk != null) {
            buf.append("Contains chunk=" + chunk);
        }
        if (partition != null) {
            buf.append("Contains partition=" + partition);
        }
        return buf.toString();
    }

}