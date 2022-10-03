package com.company.myEmployeeDetails.service;

import com.company.myEmployeeDetails.dao.EmpDAO;
import com.company.myEmployeeDetails.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public  class EmpService {
    @Autowired
   private EmpDAO empDAO;

        public Optional<Employee> getEmpByIdService( Long id){
            System.out.println("id is" + id);
            return empDAO.findById( id);
        }

        public Employee storeEmployee(Employee emp){
            return empDAO.save(emp);
        }
}
