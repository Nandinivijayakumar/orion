package com.orion;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;

import org.apache.camel.impl.DefaultExchange;
//import org.apache.camel.impl.DefaultExchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

@RestController
public class HomeController{
	
	@Autowired
	ProducerTemplate producerTemplate;
	@Autowired
	CamelContext camelContext;
	
	
	
/*	@Autowired
	EmployeeClient employeeClient;*/
	
	/* 
	@RequestMapping(value = "/reference",produces = "application/json")
	public @ResponseBody Account getUser(@RequestParam(value="accountNumber", required=false, defaultValue="123") String accountNumber){
		System.out.println(accountNumber+"****************************");
		 if("123456".equals(accountNumber)){
	            throw new ServiceException("Hey, it's a mock account");
	        }
		 
	//	 Account simpleAccount = billingService.getSimpleAccount(accountNumber);
		 
		 Account simpleAccount = new Account("1","Bhuvaneswari","Perumal","Manikandan");
		
	        if (simpleAccount == null) {	      
	          try {
				throw new AccountNotFoundException();
			} catch (AccountNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	        	
	        }
	        return simpleAccount;
		 
	}*/
	/*@RequestMapping(value = "/emp")
	public  String getUser1(){
		
         Exchange exec= new DefaultExchange(camelContext);
      
        producerTemplate.send("direct:firstRoute",exec);
			 
		return "hello1";
	}*/
	@RequestMapping(value = "/emp1")
	public  String getUser1(){
           producerTemplate.sendBody("direct:firstRoute","kayal");      	 
		return "hello1";
	}

/*	@RequestMapping(value = "/emp2")
	public  String getUser2(){
		
		
			ConnectionFactory factory = null;
					Connection connection = null;
					Channel channel = null;
					
					try {
						
						factory = new ConnectionFactory();
					    factory.setHost("localhost");
					    factory.setUsername("guest");
					    factory.setPassword("guest");
					    
					    factory.setPort(5672);
					   
					    connection = factory.newConnection();
					    channel = connection.createChannel(); 
					    channel.exchangeDeclare("exchange2", "topic",true);
					    channel.queueDeclare("queue2",true,false,false,null);
					    channel.queueBind("queue2", "exchange2", "apromo2");
					    channel.basicPublish("exchange2", "apromo2", null, "hello".getBytes());
			//	channel.txSelect();    
						channel.basicPublish(exchangeName, routingKey, new AMQP.BasicProperties.Builder()			
			            .headers(headers)
			            .build(), message.getBytes());
						channel.txCommit();

					} catch (Exception e) {
						//LOG.error("exception ", e);
						try {
							throw new Exception(e.getMessage());
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} finally {
						try {
							if(null != channel)
								channel.close();
							if(null != connection)
								connection.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (TimeoutException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					    
					} 
			

      	 
		return "hello1";
	}
*/

}
