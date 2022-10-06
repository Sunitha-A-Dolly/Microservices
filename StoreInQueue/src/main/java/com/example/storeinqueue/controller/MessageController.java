package com.example.storeinqueue.controller;

import com.example.storeinqueue.config.MQConfig;
import com.example.storeinqueue.model.Employee;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class MessageController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    static  final String fetchEmpURL ="http:localhost:8080/emp";

    @PostMapping("/publish")
    public String postMsgInQueue(@RequestBody Employee employee){
        rabbitTemplate.convertAndSend(MQConfig.EXCHANGE,MQConfig.ROUTINGKEY,employee);
        return "Successful";
    }

    @GetMapping("/invokeEmp")
    public String invokeEmpWebService(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <String> entity = new HttpEntity<String>(headers);
        return   restTemplate.exchange("http://localhost:8080/emp", HttpMethod.GET, null, String.class).getBody();


    }




}
