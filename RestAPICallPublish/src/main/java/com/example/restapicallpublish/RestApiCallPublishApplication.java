package com.example.restapicallpublish;

import com.rabbitmq.jms.admin.RMQConnectionFactory;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import javax.jms.ConnectionFactory;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
@SpringBootApplication()
@EnableJms

public class RestApiCallPublishApplication {
    @Bean
    public ConnectionFactory connectionFactory() {
        return new RMQConnectionFactory();
    }

    public static void main(String[] args) {
        SpringApplication.run(RestApiCallPublishApplication.class, args);
    }

}
