package com.orion.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
public interface Operation {

	@WebMethod
	public int add(int a, int b);
	
	@WebMethod
	public int mul(int a,int b);
	
	@WebMethod
	public float div(int a, int b);
}
