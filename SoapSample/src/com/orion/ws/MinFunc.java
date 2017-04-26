package com.orion.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.orion.bo.Calculate;

@WebService
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
public interface MinFunc {
   
	   @WebMethod
	  public Calculate findmin(Calculate calculate);
}
