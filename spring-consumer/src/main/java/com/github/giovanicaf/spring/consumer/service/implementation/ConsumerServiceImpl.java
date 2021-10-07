package com.github.giovanicaf.spring.consumer.service.implementation;

import com.github.giovanicaf.spring.consumer.dto.Message;
import com.github.giovanicaf.spring.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(Message message) throws Exception {
        //throw new Exception("Erro!");
        System.out.println(message.getText());
    }
}
