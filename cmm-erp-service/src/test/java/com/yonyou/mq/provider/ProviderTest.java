package com.yonyou.mq.provider;

import org.junit.Test;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath:application-mq-provider.xml"})
public class ProviderTest extends
        AbstractJUnit4SpringContextTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testMqSend() {
        // rabbitTemplate.send("com.suny.topic.exchange","1.2.abc", new Message("ufo".getBytes(), new MessageProperties()));
        rabbitTemplate.convertAndSend("com.suny.topic.exchange","1.2.abc", "ufo");
    }
}
