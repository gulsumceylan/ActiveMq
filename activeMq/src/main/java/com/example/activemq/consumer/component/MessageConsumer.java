package com.example.activemq.consumer.component;

import com.example.activemq.model.SystemMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class MessageConsumer {

    public static final Logger LOGGER= LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "bridgingcode-queue")
    public void messageListener(SystemMessage systemMessage){
        LOGGER.info("Message received! {}",systemMessage);
    }
}
