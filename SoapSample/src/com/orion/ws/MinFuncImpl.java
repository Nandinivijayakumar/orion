package com.orion.ws;

import javax.jws.WebService;

import com.orion.bo.Calculate;

@WebService(endpointInterface = "com.orion.ws.MinFunc")
public class MinFuncImpl implements MinFunc {

	@Override
	public Calculate findmin(Calculate calculate) {
		calculate.setC(calculate.getA()+calculate.getB());
		return calculate;
	}
	
	  
}
