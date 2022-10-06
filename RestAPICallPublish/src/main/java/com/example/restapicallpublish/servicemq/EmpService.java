package com.example.restapicallpublish.servicemq;


import com.example.restapicallpublish.model.Employee;
import com.rabbitmq.jms.admin.RMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.ConnectionFactory;
import java.util.concurrent.ConcurrentNavigableMap;

@Service
public class EmpService {
    @Autowired
    ConnectionFactory conn;

    public void sendMessage(Employee employee)  {
        JmsTemplate template = new JmsTemplate(conn);
       // var message = new SerializeMessage(employee.toString(), new Random().nextInt(50), false);
        template.convertAndSend("JMSQueue", employee);

    }


}