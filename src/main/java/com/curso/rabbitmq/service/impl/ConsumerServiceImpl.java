 package com.curso.rabbitmq.service.impl;

import org.springframework.stereotype.Service;

import com.curso.rabbitmq.dto.Message;
import com.curso.rabbitmq.service.ConsumerService;

@Service
public class ConsumerServiceImpl  implements ConsumerService{

	@Override
	public void action(Message message) throws Exception {
	
		System.out.println(message.getText());
		
	}



}
