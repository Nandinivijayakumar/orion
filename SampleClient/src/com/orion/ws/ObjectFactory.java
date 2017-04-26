
package com.orion.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orion.ws package. 
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

    private final static QName _FindminResponse_QNAME = new QName("http://ws.orion.com/", "findminResponse");
    private final static QName _Findmin_QNAME = new QName("http://ws.orion.com/", "findmin");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orion.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindminResponse }
     * 
     */
    public FindminResponse createFindminResponse() {
        return new FindminResponse();
    }

    /**
     * Create an instance of {@link Findmin }
     * 
     */
    public Findmin createFindmin() {
        return new Findmin();
    }

    /**
     * Create an instance of {@link Calculate }
     * 
     */
    public Calculate createCalculate() {
        return new Calculate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.orion.com/", name = "findminResponse")
    public JAXBElement<FindminResponse> createFindminResponse(FindminResponse value) {
        return new JAXBElement<FindminResponse>(_FindminResponse_QNAME, FindminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Findmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.orion.com/", name = "findmin")
    public JAXBElement<Findmin> createFindmin(Findmin value) {
        return new JAXBElement<Findmin>(_Findmin_QNAME, Findmin.class, null, value);
    }

}
