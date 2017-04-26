package com.orion.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.orion.vo.CalculatedResult;
import com.orion.ws.Calculate;
import com.orion.ws.MinFunc;



public class Consumer {
	
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:3030/ws/MinFuncImpl?wsdl");
		
		 QName qname = new QName("http://ws.orion.com/", "MinFuncImplService");
		 
	        Service service = Service.create(url, qname);
	 
	        MinFunc minfunc = service.getPort(MinFunc.class);
	 
	        
	     //   @RequestMapping(value="/client",method = RequestMethod.POST,consumes="application/json")
	       // public @ResponseBody  calculatedResult getdetails(@RequestBody CalculatedResult cr)
	       Calculate calculate=new Calculate();
	       calculate.setA(10);
	       calculate.setB(20);
	       
	       calculate =minfunc.findmin(calculate);
	       
	       CalculatedResult result = new CalculatedResult();
	       result.setC(calculate.getC());
	        //calculatedResult.setValue=cr.getValue();
	       
	       System.out.println("Client object contains result for FindMinoperation: " + result.getC());
	      // return calculatedResult;
	}
	
}
