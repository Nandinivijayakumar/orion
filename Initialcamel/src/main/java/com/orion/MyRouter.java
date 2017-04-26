package com.orion;


import org.apache.camel.CamelContext;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.component.cxf.DataFormat;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.component.rabbitmq.RabbitMQComponent;
import org.apache.camel.component.rabbitmq.RabbitMQConsumer;
import org.apache.camel.component.rabbitmq.RabbitMQEndpoint;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.impl.SimpleRegistry;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.ConnectionFactory;


@Component
public class MyRouter extends RouteBuilder{

	
	@Override
	public void configure() throws Exception {
		
	//	
		//CamelContext context = new DefaultCamelContext();
	//	context.addComponent("rabbitmq", RabbitMQComponent);
	
	CamelContext camelContext = getContext();
		
		/*ConnectionFactory conn=new ConnectionFactory();
		conn.setHost("localhost");
		conn.setPort(15672);
		conn.setUsername("guest");
		conn.setPassword("guest");*/
		
		//RabbitMQComponent rabbitMQComponent=new RabbitMQComponent();
	   // camelContext.addComponent("rabbitmq", new RabbitMQComponent());
	    //camelContext.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
	    
		//.bean(RabbitConnections.class,"getRabbitConnection()").
		
		/*RabbitMQEndpoint rabbitmqEndpoint=new RabbitMQEndpoint();
		rabbitmqEndpoint.setPortNumber(15672);
		rabbitmqEndpoint.setHostname("localhost");
		rabbitmqEndpoint.setExchangeName("Topic-exchange");
		rabbitmqEndpoint.setCamelContext(camelContext);
		try {
            camelContext.addEndpoint("myEndpoint", rabbitmqEndpoint);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
	//?connectionFactory=RabbitConnections
		//.bean(RabbitConnections.class,"getRabbitConnection()")
	/*SimpleRegistry registry = new SimpleRegistry(); 
	registry.put("RabbitConnections", new RabbitConnections()); 
	CamelContext context = new DefaultCamelContext(registry); */
		
		from("direct:firstRoute").to("rabbitmq://localhost:5672/rabbit-direct-2?routingKey=directq2").log("Message ${body}");
 
	
      
	}

}
