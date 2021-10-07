package com.github.giovanicaf.spring.consumer.amqp.implementation;

import com.github.giovanicaf.spring.consumer.amqp.AmqpConsumer;
import com.github.giovanicaf.spring.consumer.dto.Message;
import com.github.giovanicaf.spring.consumer.service.ConsumerService;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer implements AmqpConsumer<Message> {

    @Autowired
    private ConsumerService consumerService;

    @Value("${spring.rabbitmq.request.routing-key.producer}")
    private String queue;

    @Override
    @RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
    public void consumer(Message message) {
        try {
            consumerService.action(message);
        } catch (Exception ex){
            throw new AmqpRejectAndDontRequeueException(ex);
        }

    }
}
