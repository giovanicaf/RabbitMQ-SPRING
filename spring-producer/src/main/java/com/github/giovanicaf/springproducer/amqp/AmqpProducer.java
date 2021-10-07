package com.github.giovanicaf.springproducer.amqp;

public interface AmqpProducer<T> {

    void producer(T t);

}
