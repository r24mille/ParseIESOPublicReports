//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.20 at 08:19:11 PM EST 
//


package ca.ieso.reports.schema.vgforecastsummary;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element ref="{http://www.ieso.ca/schema}DocHeader"/>
 *         &lt;element ref="{http://www.ieso.ca/schema}DocBody"/>
 *       &lt;/sequence>
 *       &lt;attribute name="docID" type="{http://www.ieso.ca/schema}docID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "docHeaderAndDocBody"
})
@XmlRootElement(name = "Document")
public class Document {

    @XmlElements({
        @XmlElement(name = "DocHeader", required = true, type = DocHeader.class),
        @XmlElement(name = "DocBody", required = true, type = DocBody.class)
    })
    protected List<Object> docHeaderAndDocBody;
    @XmlAttribute(name = "docID")
    protected String docID;

    /**
     * Gets the value of the docHeaderAndDocBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docHeaderAndDocBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocHeaderAndDocBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocHeader }
     * {@link DocBody }
     * 
     * 
     */
    public List<Object> getDocHeaderAndDocBody() {
        if (docHeaderAndDocBody == null) {
            docHeaderAndDocBody = new ArrayList<Object>();
        }
        return this.docHeaderAndDocBody;
    }

    /**
     * Gets the value of the docID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocID() {
        return docID;
    }

    /**
     * Sets the value of the docID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocID(String value) {
        this.docID = value;
    }

}
