package com.company.employee.controller;

import com.company.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/CompanyABC")
public class EmpController {


    @GetMapping("/{employeeList}")
    public List<Employee> getEmployeeList(){
        return Collections.singletonList(new Employee(101,"Sun"));
    }
/*
    @PostMapping("/employee")
    public void storeEmp(@RequestParam ){

    }

*/
}
