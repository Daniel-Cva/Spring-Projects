package com.springboot.ems.service;

import com.springboot.ems.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> findAll();
    public Optional<Employee> findById(int id);
    public Employee save(Employee employee);
    public void deleteById(int id);
}
