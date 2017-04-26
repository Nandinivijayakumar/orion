package com.orion.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.orion.ws.Operation")
public class OperationImpl implements Operation{

	@Override
	public int add(int a, int b) {
		
		return 12;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return 23;
	}

	@Override
	public float div(int a, int b) {
		// TODO Auto-generated method stub
		return (float) 0.0;
	}

}
