package com.github.giovanicaf.spring.consumer.service;

import com.github.giovanicaf.spring.consumer.dto.Message;

public interface ConsumerService {

    void action(Message message) throws Exception;
}
