package com.curso.rabbitmq.amqp;

public interface AmqpConsumer<T> {
		
	public void consumer(T t); 
}
