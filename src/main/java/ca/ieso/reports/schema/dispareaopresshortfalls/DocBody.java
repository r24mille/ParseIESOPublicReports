//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.22 at 12:53:27 PM CST 
//


package ca.ieso.reports.schema.dispareaopresshortfalls;

import java.math.BigDecimal;
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
 *         &lt;element name="DeliveryHour" type="{http://www.ieso.ca/schema}Hour1To24"/>
 *         &lt;element name="AreaEnergies" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IntervalEnergies" maxOccurs="12">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Interval" type="{http://www.ieso.ca/schema}Interval"/>
 *                             &lt;element name="MinORRequired" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
 *                             &lt;element name="Scheduled10S" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
 *                             &lt;element name="Scheduled10N" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
 *                             &lt;element name="ORShortfall" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
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
    "deliveryHour",
    "areaEnergies"
})
@XmlRootElement(name = "DocBody")
public class DocBody {

    @XmlElement(name = "DeliveryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "DeliveryHour")
    protected int deliveryHour;
    @XmlElement(name = "AreaEnergies", required = true)
    protected List<DocBody.AreaEnergies> areaEnergies;

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
     */
    public int getDeliveryHour() {
        return deliveryHour;
    }

    /**
     * Sets the value of the deliveryHour property.
     * 
     */
    public void setDeliveryHour(int value) {
        this.deliveryHour = value;
    }

    /**
     * Gets the value of the areaEnergies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaEnergies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaEnergies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocBody.AreaEnergies }
     * 
     * 
     */
    public List<DocBody.AreaEnergies> getAreaEnergies() {
        if (areaEnergies == null) {
            areaEnergies = new ArrayList<DocBody.AreaEnergies>();
        }
        return this.areaEnergies;
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
     *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IntervalEnergies" maxOccurs="12">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Interval" type="{http://www.ieso.ca/schema}Interval"/>
     *                   &lt;element name="MinORRequired" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
     *                   &lt;element name="Scheduled10S" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
     *                   &lt;element name="Scheduled10N" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
     *                   &lt;element name="ORShortfall" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
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
        "area",
        "intervalEnergies"
    })
    public static class AreaEnergies {

        @XmlElement(name = "Area", required = true)
        protected String area;
        @XmlElement(name = "IntervalEnergies", required = true)
        protected List<DocBody.AreaEnergies.IntervalEnergies> intervalEnergies;

        /**
         * Gets the value of the area property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArea() {
            return area;
        }

        /**
         * Sets the value of the area property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArea(String value) {
            this.area = value;
        }

        /**
         * Gets the value of the intervalEnergies property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the intervalEnergies property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIntervalEnergies().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocBody.AreaEnergies.IntervalEnergies }
         * 
         * 
         */
        public List<DocBody.AreaEnergies.IntervalEnergies> getIntervalEnergies() {
            if (intervalEnergies == null) {
                intervalEnergies = new ArrayList<DocBody.AreaEnergies.IntervalEnergies>();
            }
            return this.intervalEnergies;
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
         *         &lt;element name="MinORRequired" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
         *         &lt;element name="Scheduled10S" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
         *         &lt;element name="Scheduled10N" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
         *         &lt;element name="ORShortfall" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
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
            "minORRequired",
            "scheduled10S",
            "scheduled10N",
            "orShortfall"
        })
        public static class IntervalEnergies {

            @XmlElement(name = "Interval")
            protected int interval;
            @XmlElement(name = "MinORRequired", required = true)
            protected BigDecimal minORRequired;
            @XmlElement(name = "Scheduled10S", required = true)
            protected BigDecimal scheduled10S;
            @XmlElement(name = "Scheduled10N", required = true)
            protected BigDecimal scheduled10N;
            @XmlElement(name = "ORShortfall", required = true)
            protected BigDecimal orShortfall;

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
             * Gets the value of the minORRequired property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMinORRequired() {
                return minORRequired;
            }

            /**
             * Sets the value of the minORRequired property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMinORRequired(BigDecimal value) {
                this.minORRequired = value;
            }

            /**
             * Gets the value of the scheduled10S property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getScheduled10S() {
                return scheduled10S;
            }

            /**
             * Sets the value of the scheduled10S property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setScheduled10S(BigDecimal value) {
                this.scheduled10S = value;
            }

            /**
             * Gets the value of the scheduled10N property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getScheduled10N() {
                return scheduled10N;
            }

            /**
             * Sets the value of the scheduled10N property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setScheduled10N(BigDecimal value) {
                this.scheduled10N = value;
            }

            /**
             * Gets the value of the orShortfall property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getORShortfall() {
                return orShortfall;
            }

            /**
             * Sets the value of the orShortfall property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setORShortfall(BigDecimal value) {
                this.orShortfall = value;
            }

        }

    }

}
