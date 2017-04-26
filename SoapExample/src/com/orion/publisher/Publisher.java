package com.orion.publisher;

import javax.xml.ws.Endpoint;

import com.orion.ws.OperationImpl;

public class Publisher {

	public static void main(String[] args)
	{
		System.out.println("Publisher Start point");
		Endpoint.publish("http://localhost:9007/ws/operation", new OperationImpl());
		System.out.println("Publisher End point");
	}
}
