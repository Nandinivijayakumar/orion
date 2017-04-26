package com.orion;






import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.ConnectionFactory;

@Configuration
public class RabbitConnections {

	@Bean
	public ConnectionFactory getRabbitConnection()
	{
		ConnectionFactory conn=new ConnectionFactory();
		conn.setHost("localhost");
		conn.setPort(15672);
		conn.setUsername("guest");
		conn.setPassword("guest");
		
		return conn;
	}
	
}
