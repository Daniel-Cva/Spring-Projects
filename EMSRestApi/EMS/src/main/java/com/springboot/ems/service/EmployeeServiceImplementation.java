package com.springboot.ems.service;

import com.springboot.ems.entity.Employee;
import com.springboot.ems.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeServiceImplementation implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(int id){
        return employeeRepository.findById(id);
    }
    @Override
    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteById(int id){
        employeeRepository.deleteById(id);
    }
}
