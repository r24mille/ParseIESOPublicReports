//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.31 at 11:02:20 PM EST 
//


package ca.ieso.reports.schema.sbg;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element ref="{http://www.ieso.ca/schema}DocHeader"/>
 *         &lt;element name="DocBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DailyForecast" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DateForecast" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="HourlyForecast" maxOccurs="24">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Hour" type="{http://www.ieso.ca/schema}Hour1To24"/>
 *                                       &lt;element name="EnergyMW" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ExportForecast" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
 *                             &lt;element name="MinGenerationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        @XmlElement(name = "DocBody", required = true, type = Document.DocBody.class)
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
     * {@link Document.DocBody }
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
     *         &lt;element name="DailyForecast" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DateForecast" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="HourlyForecast" maxOccurs="24">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Hour" type="{http://www.ieso.ca/schema}Hour1To24"/>
     *                             &lt;element name="EnergyMW" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ExportForecast" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
     *                   &lt;element name="MinGenerationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "dailyForecast"
    })
    public static class DocBody {

        @XmlElement(name = "DailyForecast", required = true)
        protected List<Document.DocBody.DailyForecast> dailyForecast;

        /**
         * Gets the value of the dailyForecast property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dailyForecast property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDailyForecast().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.DocBody.DailyForecast }
         * 
         * 
         */
        public List<Document.DocBody.DailyForecast> getDailyForecast() {
            if (dailyForecast == null) {
                dailyForecast = new ArrayList<Document.DocBody.DailyForecast>();
            }
            return this.dailyForecast;
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
         *         &lt;element name="DateForecast" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="HourlyForecast" maxOccurs="24">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Hour" type="{http://www.ieso.ca/schema}Hour1To24"/>
         *                   &lt;element name="EnergyMW" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ExportForecast" type="{http://www.ieso.ca/schema}MW_decimal5.1"/>
         *         &lt;element name="MinGenerationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "dateForecast",
            "hourlyForecast",
            "exportForecast",
            "minGenerationStatus"
        })
        public static class DailyForecast {

            @XmlElement(name = "DateForecast", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateForecast;
            @XmlElement(name = "HourlyForecast", required = true)
            protected List<Document.DocBody.DailyForecast.HourlyForecast> hourlyForecast;
            @XmlElement(name = "ExportForecast", required = true)
            protected BigDecimal exportForecast;
            @XmlElement(name = "MinGenerationStatus")
            protected String minGenerationStatus;

            /**
             * Gets the value of the dateForecast property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateForecast() {
                return dateForecast;
            }

            /**
             * Sets the value of the dateForecast property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateForecast(XMLGregorianCalendar value) {
                this.dateForecast = value;
            }

            /**
             * Gets the value of the hourlyForecast property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hourlyForecast property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHourlyForecast().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Document.DocBody.DailyForecast.HourlyForecast }
             * 
             * 
             */
            public List<Document.DocBody.DailyForecast.HourlyForecast> getHourlyForecast() {
                if (hourlyForecast == null) {
                    hourlyForecast = new ArrayList<Document.DocBody.DailyForecast.HourlyForecast>();
                }
                return this.hourlyForecast;
            }

            /**
             * Gets the value of the exportForecast property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getExportForecast() {
                return exportForecast;
            }

            /**
             * Sets the value of the exportForecast property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setExportForecast(BigDecimal value) {
                this.exportForecast = value;
            }

            /**
             * Gets the value of the minGenerationStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMinGenerationStatus() {
                return minGenerationStatus;
            }

            /**
             * Sets the value of the minGenerationStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMinGenerationStatus(String value) {
                this.minGenerationStatus = value;
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
             *         &lt;element name="Hour" type="{http://www.ieso.ca/schema}Hour1To24"/>
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
                "hour",
                "energyMW"
            })
            public static class HourlyForecast {

                @XmlElement(name = "Hour")
                protected int hour;
                @XmlElement(name = "EnergyMW", required = true)
                protected BigDecimal energyMW;

                /**
                 * Gets the value of the hour property.
                 * 
                 */
                public int getHour() {
                    return hour;
                }

                /**
                 * Sets the value of the hour property.
                 * 
                 */
                public void setHour(int value) {
                    this.hour = value;
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
