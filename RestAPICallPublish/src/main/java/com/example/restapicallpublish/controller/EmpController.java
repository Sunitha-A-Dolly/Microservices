package com.example.restapicallpublish.controller;


import com.example.restapicallpublish.model.Employee;
import com.example.restapicallpublish.servicemq.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Company")
public class EmpController {
    @Autowired
    EmpService empService;

    @PostMapping("/send")
    public void send(@RequestBody Employee employee) {
        empService.sendMessage(employee);
    }
}