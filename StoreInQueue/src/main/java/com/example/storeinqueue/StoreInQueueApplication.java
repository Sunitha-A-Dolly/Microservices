package com.example.storeinqueue;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StoreInQueueApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreInQueueApplication.class, args);

    }



}
