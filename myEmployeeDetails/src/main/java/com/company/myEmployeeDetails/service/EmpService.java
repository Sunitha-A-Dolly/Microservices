package com.company.myEmployeeDetails.service;

import ch.qos.logback.classic.spi.IThrowableProxy;
import com.company.myEmployeeDetails.dao.EmpDAO;
import com.company.myEmployeeDetails.exception.CustomException;
import com.company.myEmployeeDetails.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class EmpService {
    @Autowired
   private EmpDAO empDAO;


    public Optional<Employee> getEmpByIdService( Long id){
            System.out.println("id is" + id);
            return empDAO.findById( id);
        }
    public List<Employee> getAllEmpService() {
        return empDAO.findAll();
    }

    public Employee createEmpService(Employee emp) {
        System.out.println("Location " + emp.getLocation() +"Name: "+emp.getName());
        return empDAO.save(emp);
    }

    public void deleteEmpService( long id) {
        empDAO.deleteById(id);
    }

    public Employee updateEmpService( Employee emp,Long id){
            Employee empExisting;
            empExisting = empDAO.findById( id).orElseThrow(() -> new CustomException("Resource not found"));
            empExisting.setId(emp.getId());
            empExisting.setLocation(emp.getLocation());
            empExisting.setName(emp.getName());
            System.out.println("update for id " + id + " is successful");
            empDAO.save(empExisting);
            return empExisting;
    }
}
