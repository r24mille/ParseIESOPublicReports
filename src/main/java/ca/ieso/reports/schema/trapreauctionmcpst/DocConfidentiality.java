//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.25 at 10:03:56 PM CST 
//


package ca.ieso.reports.schema.trapreauctionmcpst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.ieso.ca/schema}DocConfClass"/>
 *         &lt;element ref="{http://www.ieso.ca/schema}DocConfGroups" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "docConfClass",
    "docConfGroups"
})
@XmlRootElement(name = "DocConfidentiality")
public class DocConfidentiality {

    @XmlElement(name = "DocConfClass", required = true)
    protected ConfidentialityClass docConfClass;
    @XmlElement(name = "DocConfGroups")
    protected DocConfGroups docConfGroups;

    /**
     * Gets the value of the docConfClass property.
     * 
     * @return
     *     possible object is
     *     {@link ConfidentialityClass }
     *     
     */
    public ConfidentialityClass getDocConfClass() {
        return docConfClass;
    }

    /**
     * Sets the value of the docConfClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidentialityClass }
     *     
     */
    public void setDocConfClass(ConfidentialityClass value) {
        this.docConfClass = value;
    }

    /**
     * Gets the value of the docConfGroups property.
     * 
     * @return
     *     possible object is
     *     {@link DocConfGroups }
     *     
     */
    public DocConfGroups getDocConfGroups() {
        return docConfGroups;
    }

    /**
     * Sets the value of the docConfGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocConfGroups }
     *     
     */
    public void setDocConfGroups(DocConfGroups value) {
        this.docConfGroups = value;
    }

}
