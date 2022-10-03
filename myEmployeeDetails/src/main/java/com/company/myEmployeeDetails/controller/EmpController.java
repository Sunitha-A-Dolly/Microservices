package com.company.myEmployeeDetails.controller;

import com.company.myEmployeeDetails.model.Employee;
import com.company.myEmployeeDetails.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;


    // Get Emp by Id
    @GetMapping(value = "/{id}")
    public Optional<Employee> getEmpById(@PathVariable("id") Long id) {
        return empService.getEmpByIdService(id);
    }

    // Get All Emp
    @GetMapping
    public List<Employee> getAllEmp() {
        return empService.getAllEmpService();
    }

    // Create Employee
    @RequestMapping( method = RequestMethod.POST)
    public Employee createEmp(@RequestBody Employee emp) {
        System.out.println("Location " + emp.getLocation() +"Name: "+emp.getName());

        return empService.createEmpService(emp);
    }

    // Update Emp by Id
    @PutMapping("/{id}")
    public Employee updateEmpBasedOnId(@RequestBody Employee emp, @PathVariable("id") long id) {
       return empService.updateEmpService(emp,id);
    }

    // Delete Emp by Id
    @DeleteMapping("/{id}")
    public void getEmpById( @PathVariable("id") long id) {
         empService.deleteEmpService(id);
    }



}
