package com.github.giovanicaf.spring.consumer.amqp;

public interface AmqpConsumer<T> {

    void consumer(T t);
}
