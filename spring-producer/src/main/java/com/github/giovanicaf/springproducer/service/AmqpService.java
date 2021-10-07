package com.github.giovanicaf.springproducer.service;

import com.github.giovanicaf.springproducer.dto.Message;

public interface AmqpService {
    void sendToConsumer(Message message);
}
