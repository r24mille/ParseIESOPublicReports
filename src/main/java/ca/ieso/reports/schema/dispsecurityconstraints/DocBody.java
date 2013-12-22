//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.22 at 12:53:28 PM CST 
//


package ca.ieso.reports.schema.dispsecurityconstraints;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DeliveryHour" type="{http://www.ieso.ca/schema}Hour1To24" maxOccurs="24"/>
 *         &lt;element name="IntervalConstraint" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Interval" type="{http://www.ieso.ca/schema}Interval"/>
 *                   &lt;element name="Constraint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
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
@XmlType(name = "", propOrder = {
    "deliveryDate",
    "deliveryHour",
    "intervalConstraint"
})
@XmlRootElement(name = "DocBody")
public class DocBody {

    @XmlElement(name = "DeliveryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "DeliveryHour", type = Integer.class)
    protected List<Integer> deliveryHour;
    @XmlElement(name = "IntervalConstraint")
    protected List<DocBody.IntervalConstraint> intervalConstraint;

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the deliveryHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDeliveryHour() {
        if (deliveryHour == null) {
            deliveryHour = new ArrayList<Integer>();
        }
        return this.deliveryHour;
    }

    /**
     * Gets the value of the intervalConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intervalConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntervalConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocBody.IntervalConstraint }
     * 
     * 
     */
    public List<DocBody.IntervalConstraint> getIntervalConstraint() {
        if (intervalConstraint == null) {
            intervalConstraint = new ArrayList<DocBody.IntervalConstraint>();
        }
        return this.intervalConstraint;
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
     *         &lt;element name="Interval" type="{http://www.ieso.ca/schema}Interval"/>
     *         &lt;element name="Constraint" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "interval",
        "constraint"
    })
    public static class IntervalConstraint {

        @XmlElement(name = "Interval")
        protected int interval;
        @XmlElement(name = "Constraint", required = true)
        protected String constraint;

        /**
         * Gets the value of the interval property.
         * 
         */
        public int getInterval() {
            return interval;
        }

        /**
         * Sets the value of the interval property.
         * 
         */
        public void setInterval(int value) {
            this.interval = value;
        }

        /**
         * Gets the value of the constraint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConstraint() {
            return constraint;
        }

        /**
         * Sets the value of the constraint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConstraint(String value) {
            this.constraint = value;
        }

    }

}
