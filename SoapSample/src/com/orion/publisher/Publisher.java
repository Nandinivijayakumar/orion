package com.orion.publisher;

import javax.xml.ws.Endpoint;

import com.orion.ws.MinFuncImpl;

public class Publisher {
	public static void main(String[] args) {
		  Endpoint.publish("http://localhost:3030/ws/MinFuncImpl", new MinFuncImpl());
	}
	
}
