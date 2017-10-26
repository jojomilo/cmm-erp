package com.yonyou.mq.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class Queue01Consumer implements MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.println(new String(message.getBody()));
    }
}
