//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.24 at 10:52:47 AM CST 
//


package ca.ieso.reports.schema.nislshadowprices;

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
 *         &lt;element name="IntertieShadowPrices" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IntertieZoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="HourlyShadowPrices" maxOccurs="24">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DeliveryHour" type="{http://www.ieso.ca/schema}Hour1To24"/>
 *                             &lt;element name="NISLConstrainedPrice" type="{http://www.ieso.ca/schema}Money"/>
 *                             &lt;element name="NISLUnconstrainedPrice" type="{http://www.ieso.ca/schema}Money"/>
 *                             &lt;element name="ICP" type="{http://www.ieso.ca/schema}Money"/>
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
    "intertieShadowPrices"
})
@XmlRootElement(name = "DocBody")
public class DocBody {

    @XmlElement(name = "DeliveryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "IntertieShadowPrices", required = true)
    protected List<DocBody.IntertieShadowPrices> intertieShadowPrices;

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
     * Gets the value of the intertieShadowPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intertieShadowPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntertieShadowPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocBody.IntertieShadowPrices }
     * 
     * 
     */
    public List<DocBody.IntertieShadowPrices> getIntertieShadowPrices() {
        if (intertieShadowPrices == null) {
            intertieShadowPrices = new ArrayList<DocBody.IntertieShadowPrices>();
        }
        return this.intertieShadowPrices;
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
     *         &lt;element name="HourlyShadowPrices" maxOccurs="24">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DeliveryHour" type="{http://www.ieso.ca/schema}Hour1To24"/>
     *                   &lt;element name="NISLConstrainedPrice" type="{http://www.ieso.ca/schema}Money"/>
     *                   &lt;element name="NISLUnconstrainedPrice" type="{http://www.ieso.ca/schema}Money"/>
     *                   &lt;element name="ICP" type="{http://www.ieso.ca/schema}Money"/>
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
        "hourlyShadowPrices"
    })
    public static class IntertieShadowPrices {

        @XmlElement(name = "IntertieZoneName", required = true)
        protected String intertieZoneName;
        @XmlElement(name = "HourlyShadowPrices", required = true)
        protected List<DocBody.IntertieShadowPrices.HourlyShadowPrices> hourlyShadowPrices;

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
         * Gets the value of the hourlyShadowPrices property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hourlyShadowPrices property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHourlyShadowPrices().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocBody.IntertieShadowPrices.HourlyShadowPrices }
         * 
         * 
         */
        public List<DocBody.IntertieShadowPrices.HourlyShadowPrices> getHourlyShadowPrices() {
            if (hourlyShadowPrices == null) {
                hourlyShadowPrices = new ArrayList<DocBody.IntertieShadowPrices.HourlyShadowPrices>();
            }
            return this.hourlyShadowPrices;
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
         *         &lt;element name="DeliveryHour" type="{http://www.ieso.ca/schema}Hour1To24"/>
         *         &lt;element name="NISLConstrainedPrice" type="{http://www.ieso.ca/schema}Money"/>
         *         &lt;element name="NISLUnconstrainedPrice" type="{http://www.ieso.ca/schema}Money"/>
         *         &lt;element name="ICP" type="{http://www.ieso.ca/schema}Money"/>
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
            "deliveryHour",
            "nislConstrainedPrice",
            "nislUnconstrainedPrice",
            "icp"
        })
        public static class HourlyShadowPrices {

            @XmlElement(name = "DeliveryHour")
            protected int deliveryHour;
            @XmlElement(name = "NISLConstrainedPrice", required = true)
            protected BigDecimal nislConstrainedPrice;
            @XmlElement(name = "NISLUnconstrainedPrice", required = true)
            protected BigDecimal nislUnconstrainedPrice;
            @XmlElement(name = "ICP", required = true)
            protected BigDecimal icp;

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
             * Gets the value of the nislConstrainedPrice property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNISLConstrainedPrice() {
                return nislConstrainedPrice;
            }

            /**
             * Sets the value of the nislConstrainedPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNISLConstrainedPrice(BigDecimal value) {
                this.nislConstrainedPrice = value;
            }

            /**
             * Gets the value of the nislUnconstrainedPrice property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNISLUnconstrainedPrice() {
                return nislUnconstrainedPrice;
            }

            /**
             * Sets the value of the nislUnconstrainedPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNISLUnconstrainedPrice(BigDecimal value) {
                this.nislUnconstrainedPrice = value;
            }

            /**
             * Gets the value of the icp property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getICP() {
                return icp;
            }

            /**
             * Sets the value of the icp property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setICP(BigDecimal value) {
                this.icp = value;
            }

        }

    }

}
