package com.yonyou.mq.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class Queue02Consumer implements MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.println(message.toString());
    }
}
