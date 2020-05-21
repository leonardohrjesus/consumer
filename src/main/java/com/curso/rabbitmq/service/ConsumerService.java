package com.curso.rabbitmq.service;

import com.curso.rabbitmq.dto.Message;

public interface ConsumerService {
	
	public void action(Message message)throws Exception;

}
