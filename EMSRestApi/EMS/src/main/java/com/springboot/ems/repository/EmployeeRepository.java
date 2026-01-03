package com.springboot.ems.repository;

import com.springboot.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    //Spring will provide code for us
}
