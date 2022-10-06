package com.example.restapicallpublish.mqconfig;

import com.rabbitmq.jms.admin.RMQConnectionFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConnectionConfig {


    @Bean
    public ConnectionFactory jmsConnectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        connectionFactory.setVirtualHost("/");
        connectionFactory.setHost("localhost");
        connectionFactory.setPort(5672);
        return  connectionFactory;
    }
}
