package com.github.giovanicaf.springproducer.service.implementation;

import com.github.giovanicaf.springproducer.amqp.AmqpProducer;
import com.github.giovanicaf.springproducer.dto.Message;
import com.github.giovanicaf.springproducer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQServiceImpl implements AmqpService {

    @Autowired
    private AmqpProducer<Message> amqp;

    @Override
    public void sendToConsumer(Message message) {
        amqp.producer(message);
    }
}
