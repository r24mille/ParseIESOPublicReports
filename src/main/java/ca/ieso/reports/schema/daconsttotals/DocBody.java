//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.20 at 08:19:19 PM EST 
//


package ca.ieso.reports.schema.daconsttotals;

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
 *         &lt;element name="Energies" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HourlyConstrainedEnergy" maxOccurs="24">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DeliveryHour" type="{http://www.ieso.ca/schema}Hour1To24"/>
 *                             &lt;element name="MQ" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="MarketQuantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="EnergyMW" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
    "energies"
})
@XmlRootElement(name = "DocBody")
public class DocBody {

    @XmlElement(name = "DeliveryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "Energies", required = true)
    protected List<DocBody.Energies> energies;

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
     * Gets the value of the energies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocBody.Energies }
     * 
     * 
     */
    public List<DocBody.Energies> getEnergies() {
        if (energies == null) {
            energies = new ArrayList<DocBody.Energies>();
        }
        return this.energies;
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
     *         &lt;element name="HourlyConstrainedEnergy" maxOccurs="24">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DeliveryHour" type="{http://www.ieso.ca/schema}Hour1To24"/>
     *                   &lt;element name="MQ" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="MarketQuantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="EnergyMW" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
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
        "hourlyConstrainedEnergy"
    })
    public static class Energies {

        @XmlElement(name = "HourlyConstrainedEnergy", required = true)
        protected List<DocBody.Energies.HourlyConstrainedEnergy> hourlyConstrainedEnergy;

        /**
         * Gets the value of the hourlyConstrainedEnergy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hourlyConstrainedEnergy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHourlyConstrainedEnergy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocBody.Energies.HourlyConstrainedEnergy }
         * 
         * 
         */
        public List<DocBody.Energies.HourlyConstrainedEnergy> getHourlyConstrainedEnergy() {
            if (hourlyConstrainedEnergy == null) {
                hourlyConstrainedEnergy = new ArrayList<DocBody.Energies.HourlyConstrainedEnergy>();
            }
            return this.hourlyConstrainedEnergy;
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
         *         &lt;element name="MQ" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="MarketQuantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="EnergyMW" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
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
            "deliveryHour",
            "mq"
        })
        public static class HourlyConstrainedEnergy {

            @XmlElement(name = "DeliveryHour")
            protected int deliveryHour;
            @XmlElement(name = "MQ", required = true)
            protected List<DocBody.Energies.HourlyConstrainedEnergy.MQ> mq;

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
             * Gets the value of the mq property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mq property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMQ().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DocBody.Energies.HourlyConstrainedEnergy.MQ }
             * 
             * 
             */
            public List<DocBody.Energies.HourlyConstrainedEnergy.MQ> getMQ() {
                if (mq == null) {
                    mq = new ArrayList<DocBody.Energies.HourlyConstrainedEnergy.MQ>();
                }
                return this.mq;
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
             *         &lt;element name="MarketQuantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="EnergyMW" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
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
                "marketQuantity",
                "energyMW"
            })
            public static class MQ {

                @XmlElement(name = "MarketQuantity", required = true)
                protected String marketQuantity;
                @XmlElement(name = "EnergyMW", required = true)
                protected BigDecimal energyMW;

                /**
                 * Gets the value of the marketQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMarketQuantity() {
                    return marketQuantity;
                }

                /**
                 * Sets the value of the marketQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMarketQuantity(String value) {
                    this.marketQuantity = value;
                }

                /**
                 * Gets the value of the energyMW property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getEnergyMW() {
                    return energyMW;
                }

                /**
                 * Sets the value of the energyMW property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setEnergyMW(BigDecimal value) {
                    this.energyMW = value;
                }

            }

        }

    }

}
