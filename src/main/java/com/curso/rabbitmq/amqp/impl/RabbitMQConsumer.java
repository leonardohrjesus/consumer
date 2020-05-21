package com.curso.rabbitmq.amqp.impl;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.curso.rabbitmq.amqp.AmqpConsumer;
import com.curso.rabbitmq.dto.Message;
import com.curso.rabbitmq.service.ConsumerService;

@Component
public class RabbitMQConsumer implements AmqpConsumer<Message> {

	@Autowired
	private ConsumerService consumerService;

	@Override
	@RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
	public void consumer(Message message) {
		try {
			consumerService.action(message);

		} catch (Exception e) {
			throw new AmqpRejectAndDontRequeueException(e);
		}

	}
}
