//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.24 at 10:53:46 AM CST 
//


package ca.ieso.reports.schema.predispmkttotals;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ca.ieso.reports.schema.predispmkttotals package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DocConfClass_QNAME = new QName("http://www.ieso.ca/schema", "DocConfClass");
    private final static QName _CreatedAt_QNAME = new QName("http://www.ieso.ca/schema", "CreatedAt");
    private final static QName _DocTitle_QNAME = new QName("http://www.ieso.ca/schema", "DocTitle");
    private final static QName _DocRevision_QNAME = new QName("http://www.ieso.ca/schema", "DocRevision");
    private final static QName _DocConfGroup_QNAME = new QName("http://www.ieso.ca/schema", "DocConfGroup");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ca.ieso.reports.schema.predispmkttotals
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocBody }
     * 
     */
    public DocBody createDocBody() {
        return new DocBody();
    }

    /**
     * Create an instance of {@link DocBody.Energies }
     * 
     */
    public DocBody.Energies createDocBodyEnergies() {
        return new DocBody.Energies();
    }

    /**
     * Create an instance of {@link DocBody.Energies.HourlyUnConstrainedEnergy }
     * 
     */
    public DocBody.Energies.HourlyUnConstrainedEnergy createDocBodyEnergiesHourlyUnConstrainedEnergy() {
        return new DocBody.Energies.HourlyUnConstrainedEnergy();
    }

    /**
     * Create an instance of {@link DocConfidentiality }
     * 
     */
    public DocConfidentiality createDocConfidentiality() {
        return new DocConfidentiality();
    }

    /**
     * Create an instance of {@link DocConfGroups }
     * 
     */
    public DocConfGroups createDocConfGroups() {
        return new DocConfGroups();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link DocHeader }
     * 
     */
    public DocHeader createDocHeader() {
        return new DocHeader();
    }

    /**
     * Create an instance of {@link DocBody.Energies.HourlyUnConstrainedEnergy.MQ }
     * 
     */
    public DocBody.Energies.HourlyUnConstrainedEnergy.MQ createDocBodyEnergiesHourlyUnConstrainedEnergyMQ() {
        return new DocBody.Energies.HourlyUnConstrainedEnergy.MQ();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfidentialityClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ieso.ca/schema", name = "DocConfClass")
    public JAXBElement<ConfidentialityClass> createDocConfClass(ConfidentialityClass value) {
        return new JAXBElement<ConfidentialityClass>(_DocConfClass_QNAME, ConfidentialityClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ieso.ca/schema", name = "CreatedAt")
    public JAXBElement<XMLGregorianCalendar> createCreatedAt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreatedAt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ieso.ca/schema", name = "DocTitle")
    public JAXBElement<String> createDocTitle(String value) {
        return new JAXBElement<String>(_DocTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ieso.ca/schema", name = "DocRevision")
    public JAXBElement<BigInteger> createDocRevision(BigInteger value) {
        return new JAXBElement<BigInteger>(_DocRevision_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ieso.ca/schema", name = "DocConfGroup")
    public JAXBElement<String> createDocConfGroup(String value) {
        return new JAXBElement<String>(_DocConfGroup_QNAME, String.class, null, value);
    }

}
