package com.company.employee.controller;

import com.company.employee.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.PrivilegedAction;
import java.util.List;

@RestController
public class EmpController {

    private Object Employee;

    @GetMapping("/{employeeList}")
    public String getEmployeeList(){
        return "employee list in-progress";
    }
/*
    @PostMapping("/employee")
    public void storeEmp(@RequestParam ){

    }
*/

}
