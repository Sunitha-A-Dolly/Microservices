package com.company.myEmployeeDetails.dao;

import com.company.myEmployeeDetails.model.Employee;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpDAO extends JpaRepository<Employee,Long> {

}
