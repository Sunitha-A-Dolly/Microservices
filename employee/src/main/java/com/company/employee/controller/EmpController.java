package com.company.employee.controller;

import com.company.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/comp")
public class EmpController {


    @GetMapping("/all")
    public List<Employee> getEmployeeList(){
        return Collections.singletonList(new Employee(105,"Sun"));
    }
    @GetMapping("/empid")
    public List<Employee> getEmployeeById(@RequestParam int empId){
        return Collections.singletonList(new Employee(empId,"RequestParam value"));
    }

    @GetMapping("/{empid}")
    public List<Employee> getEmployeeByIdUsingPathParam(@PathVariable("empid") Integer empId){
        return Collections.singletonList(new Employee(empId,"PathParam"));
    }
/*
    @PostMapping("/employee")
    public void storeEmp(@RequestParam ){

    }

*/
}
