package com.orion.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.orion.ws.Operation;

public class Client {
	
	public static void main(String args[]) throws MalformedURLException
	{
		URL url = new URL("http://localhost:9007/ws/operation?wsdl");
		 
        //1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.orion.com/", "OperationImplService");
 
        Service service = Service.create(url, qname);
 
        Operation operation = service.getPort(Operation.class);
 
        System.out.println(operation.add(12, 13));
        System.out.println(operation.mul(12, 13));
        System.out.println(operation.div(12, 13));
        
	}

}
