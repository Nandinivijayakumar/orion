
package com.orion.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MinFunc", targetNamespace = "http://ws.orion.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MinFunc {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.orion.ws.Calculate
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findmin", targetNamespace = "http://ws.orion.com/", className = "com.orion.ws.Findmin")
    @ResponseWrapper(localName = "findminResponse", targetNamespace = "http://ws.orion.com/", className = "com.orion.ws.FindminResponse")
    @Action(input = "http://ws.orion.com/MinFunc/findminRequest", output = "http://ws.orion.com/MinFunc/findminResponse")
    public Calculate findmin(
        @WebParam(name = "arg0", targetNamespace = "")
        Calculate arg0);

}
