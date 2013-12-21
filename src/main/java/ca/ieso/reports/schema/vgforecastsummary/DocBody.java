//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.20 at 08:19:11 PM EST 
//


package ca.ieso.reports.schema.vgforecastsummary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="ForecastTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrganizationData" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrganizationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FuelData" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FuelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ResourceData" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ZoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="EnergyForecast" maxOccurs="3" minOccurs="2">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ForecastDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                 &lt;element name="ForecastInterval" maxOccurs="24">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ForecastHour" type="{http://www.ieso.ca/schema}Hour1To24"/>
 *                                                           &lt;element name="MWOutput" type="{http://www.ieso.ca/schema}MW_decimal5.1" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
    "forecastTimeStamp",
    "organizationData"
})
@XmlRootElement(name = "DocBody")
public class DocBody {

    @XmlElement(name = "ForecastTimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar forecastTimeStamp;
    @XmlElement(name = "OrganizationData", required = true)
    protected List<DocBody.OrganizationData> organizationData;

    /**
     * Gets the value of the forecastTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForecastTimeStamp() {
        return forecastTimeStamp;
    }

    /**
     * Sets the value of the forecastTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForecastTimeStamp(XMLGregorianCalendar value) {
        this.forecastTimeStamp = value;
    }

    /**
     * Gets the value of the organizationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocBody.OrganizationData }
     * 
     * 
     */
    public List<DocBody.OrganizationData> getOrganizationData() {
        if (organizationData == null) {
            organizationData = new ArrayList<DocBody.OrganizationData>();
        }
        return this.organizationData;
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
     *         &lt;element name="OrganizationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FuelData" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FuelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ResourceData" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ZoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="EnergyForecast" maxOccurs="3" minOccurs="2">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ForecastDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                       &lt;element name="ForecastInterval" maxOccurs="24">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ForecastHour" type="{http://www.ieso.ca/schema}Hour1To24"/>
     *                                                 &lt;element name="MWOutput" type="{http://www.ieso.ca/schema}MW_decimal5.1" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
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
        "organizationType",
        "fuelData"
    })
    public static class OrganizationData {

        @XmlElement(name = "OrganizationType", required = true)
        protected String organizationType;
        @XmlElement(name = "FuelData", required = true)
        protected List<DocBody.OrganizationData.FuelData> fuelData;

        /**
         * Gets the value of the organizationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganizationType() {
            return organizationType;
        }

        /**
         * Sets the value of the organizationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganizationType(String value) {
            this.organizationType = value;
        }

        /**
         * Gets the value of the fuelData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fuelData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFuelData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocBody.OrganizationData.FuelData }
         * 
         * 
         */
        public List<DocBody.OrganizationData.FuelData> getFuelData() {
            if (fuelData == null) {
                fuelData = new ArrayList<DocBody.OrganizationData.FuelData>();
            }
            return this.fuelData;
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
         *         &lt;element name="FuelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ResourceData" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ZoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="EnergyForecast" maxOccurs="3" minOccurs="2">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ForecastDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                             &lt;element name="ForecastInterval" maxOccurs="24">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ForecastHour" type="{http://www.ieso.ca/schema}Hour1To24"/>
         *                                       &lt;element name="MWOutput" type="{http://www.ieso.ca/schema}MW_decimal5.1" minOccurs="0"/>
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
            "fuelType",
            "resourceData"
        })
        public static class FuelData {

            @XmlElement(name = "FuelType", required = true)
            protected String fuelType;
            @XmlElement(name = "ResourceData", required = true)
            protected List<DocBody.OrganizationData.FuelData.ResourceData> resourceData;

            /**
             * Gets the value of the fuelType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFuelType() {
                return fuelType;
            }

            /**
             * Sets the value of the fuelType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFuelType(String value) {
                this.fuelType = value;
            }

            /**
             * Gets the value of the resourceData property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the resourceData property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getResourceData().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DocBody.OrganizationData.FuelData.ResourceData }
             * 
             * 
             */
            public List<DocBody.OrganizationData.FuelData.ResourceData> getResourceData() {
                if (resourceData == null) {
                    resourceData = new ArrayList<DocBody.OrganizationData.FuelData.ResourceData>();
                }
                return this.resourceData;
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
             *         &lt;element name="ZoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="EnergyForecast" maxOccurs="3" minOccurs="2">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ForecastDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                   &lt;element name="ForecastInterval" maxOccurs="24">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ForecastHour" type="{http://www.ieso.ca/schema}Hour1To24"/>
             *                             &lt;element name="MWOutput" type="{http://www.ieso.ca/schema}MW_decimal5.1" minOccurs="0"/>
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
                "zoneName",
                "energyForecast"
            })
            public static class ResourceData {

                @XmlElement(name = "ZoneName", required = true)
                protected String zoneName;
                @XmlElement(name = "EnergyForecast", required = true)
                protected List<DocBody.OrganizationData.FuelData.ResourceData.EnergyForecast> energyForecast;

                /**
                 * Gets the value of the zoneName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getZoneName() {
                    return zoneName;
                }

                /**
                 * Sets the value of the zoneName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setZoneName(String value) {
                    this.zoneName = value;
                }

                /**
                 * Gets the value of the energyForecast property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the energyForecast property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEnergyForecast().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DocBody.OrganizationData.FuelData.ResourceData.EnergyForecast }
                 * 
                 * 
                 */
                public List<DocBody.OrganizationData.FuelData.ResourceData.EnergyForecast> getEnergyForecast() {
                    if (energyForecast == null) {
                        energyForecast = new ArrayList<DocBody.OrganizationData.FuelData.ResourceData.EnergyForecast>();
                    }
                    return this.energyForecast;
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
                 *         &lt;element name="ForecastDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="ForecastInterval" maxOccurs="24">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ForecastHour" type="{http://www.ieso.ca/schema}Hour1To24"/>
                 *                   &lt;element name="MWOutput" type="{http://www.ieso.ca/schema}MW_decimal5.1" minOccurs="0"/>
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
                    "forecastDate",
                    "forecastInterval"
                })
                public static class EnergyForecast {

                    @XmlElement(name = "ForecastDate", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar forecastDate;
                    @XmlElement(name = "ForecastInterval", required = true)
                    protected List<DocBody.OrganizationData.FuelData.ResourceData.EnergyForecast.ForecastInterval> forecastInterval;

                    /**
                     * Gets the value of the forecastDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getForecastDate() {
                        return forecastDate;
                    }

                    /**
                     * Sets the value of the forecastDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setForecastDate(XMLGregorianCalendar value) {
                        this.forecastDate = value;
                    }

                    /**
                     * Gets the value of the forecastInterval property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the forecastInterval property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getForecastInterval().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link DocBody.OrganizationData.FuelData.ResourceData.EnergyForecast.ForecastInterval }
                     * 
                     * 
                     */
                    public List<DocBody.OrganizationData.FuelData.ResourceData.EnergyForecast.ForecastInterval> getForecastInterval() {
                        if (forecastInterval == null) {
                            forecastInterval = new ArrayList<DocBody.OrganizationData.FuelData.ResourceData.EnergyForecast.ForecastInterval>();
                        }
                        return this.forecastInterval;
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
                     *         &lt;element name="ForecastHour" type="{http://www.ieso.ca/schema}Hour1To24"/>
                     *         &lt;element name="MWOutput" type="{http://www.ieso.ca/schema}MW_decimal5.1" minOccurs="0"/>
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
                        "forecastHour",
                        "mwOutput"
                    })
                    public static class ForecastInterval {

                        @XmlElement(name = "ForecastHour")
                        protected int forecastHour;
                        @XmlElementRef(name = "MWOutput", namespace = "http://www.ieso.ca/schema", type = JAXBElement.class)
                        protected JAXBElement<BigDecimal> mwOutput;

                        /**
                         * Gets the value of the forecastHour property.
                         * 
                         */
                        public int getForecastHour() {
                            return forecastHour;
                        }

                        /**
                         * Sets the value of the forecastHour property.
                         * 
                         */
                        public void setForecastHour(int value) {
                            this.forecastHour = value;
                        }

                        /**
                         * Gets the value of the mwOutput property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                         *     
                         */
                        public JAXBElement<BigDecimal> getMWOutput() {
                            return mwOutput;
                        }

                        /**
                         * Sets the value of the mwOutput property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                         *     
                         */
                        public void setMWOutput(JAXBElement<BigDecimal> value) {
                            this.mwOutput = value;
                        }

                    }

                }

            }

        }

    }

}
