package com.company.myEmployeeDetails.controller;

import com.company.myEmployeeDetails.model.Employee;
import com.company.myEmployeeDetails.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/comp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping(value = "/emp/{id}")
    public Optional<Employee> getEmpById(@PathVariable Long id) {
        return empService.getEmpByIdService(id);
    }
    @PostMapping("/employeePost")
    public Employee getEmpById(Employee emp) {
        return empService.storeEmployee(emp);
    }




}
