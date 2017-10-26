package com.yonyou.mq.consumer;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath:application-mq-consumer.xml"})
public class ConsumerTest extends
        AbstractJUnit4SpringContextTests {

    @Test
    public void test() {}
}
