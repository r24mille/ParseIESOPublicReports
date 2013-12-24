//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.24 at 10:53:30 AM CST 
//


package ca.ieso.reports.schema.predispintertieschedlimits;

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
 *         &lt;element name="IntertieZonalEnergies" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IntertieZoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="HourlyEnergies" maxOccurs="4">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="HourlyEnergy" type="{http://www.ieso.ca/schema}HourlyValue" maxOccurs="24"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "intertieZonalEnergies"
})
@XmlRootElement(name = "DocBody")
public class DocBody {

    @XmlElement(name = "DeliveryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "IntertieZonalEnergies", required = true)
    protected List<DocBody.IntertieZonalEnergies> intertieZonalEnergies;

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
     * Gets the value of the intertieZonalEnergies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intertieZonalEnergies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntertieZonalEnergies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocBody.IntertieZonalEnergies }
     * 
     * 
     */
    public List<DocBody.IntertieZonalEnergies> getIntertieZonalEnergies() {
        if (intertieZonalEnergies == null) {
            intertieZonalEnergies = new ArrayList<DocBody.IntertieZonalEnergies>();
        }
        return this.intertieZonalEnergies;
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
     *         &lt;element name="IntertieZoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="HourlyEnergies" maxOccurs="4">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="HourlyEnergy" type="{http://www.ieso.ca/schema}HourlyValue" maxOccurs="24"/>
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
        "intertieZoneName",
        "hourlyEnergies"
    })
    public static class IntertieZonalEnergies {

        @XmlElement(name = "IntertieZoneName", required = true)
        protected String intertieZoneName;
        @XmlElement(name = "HourlyEnergies", required = true)
        protected List<DocBody.IntertieZonalEnergies.HourlyEnergies> hourlyEnergies;

        /**
         * Gets the value of the intertieZoneName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntertieZoneName() {
            return intertieZoneName;
        }

        /**
         * Sets the value of the intertieZoneName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntertieZoneName(String value) {
            this.intertieZoneName = value;
        }

        /**
         * Gets the value of the hourlyEnergies property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hourlyEnergies property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHourlyEnergies().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocBody.IntertieZonalEnergies.HourlyEnergies }
         * 
         * 
         */
        public List<DocBody.IntertieZonalEnergies.HourlyEnergies> getHourlyEnergies() {
            if (hourlyEnergies == null) {
                hourlyEnergies = new ArrayList<DocBody.IntertieZonalEnergies.HourlyEnergies>();
            }
            return this.hourlyEnergies;
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
         *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="HourlyEnergy" type="{http://www.ieso.ca/schema}HourlyValue" maxOccurs="24"/>
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
            "priceType",
            "hourlyEnergy"
        })
        public static class HourlyEnergies {

            @XmlElement(name = "PriceType", required = true)
            protected String priceType;
            @XmlElement(name = "HourlyEnergy", required = true)
            protected List<HourlyValue> hourlyEnergy;

            /**
             * Gets the value of the priceType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceType() {
                return priceType;
            }

            /**
             * Sets the value of the priceType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriceType(String value) {
                this.priceType = value;
            }

            /**
             * Gets the value of the hourlyEnergy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hourlyEnergy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHourlyEnergy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link HourlyValue }
             * 
             * 
             */
            public List<HourlyValue> getHourlyEnergy() {
                if (hourlyEnergy == null) {
                    hourlyEnergy = new ArrayList<HourlyValue>();
                }
                return this.hourlyEnergy;
            }

        }

    }

}
