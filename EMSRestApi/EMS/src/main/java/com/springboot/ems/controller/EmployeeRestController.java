package com.springboot.ems.controller;

import com.springboot.ems.entity.Employee;
import com.springboot.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees") //Get All Employees
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }


    @GetMapping("/employees/{employeeId}") //Get Employee By id
    public Optional<Employee> getEmployee(@PathVariable int employeeId) {
        return employeeService.findById(employeeId);
    }

    @PostMapping("/employees")// Add New Employee
    public Employee addEmployee(@RequestBody Employee employee) {
        Employee dbEmployee = employeeService.save(employee);
        return dbEmployee;
    }

    @PutMapping("/employees") // Update Existing Employee
    public Employee updateEmployee(@RequestBody Employee employee) {
        Employee dbEmployee = employeeService.save(employee);
        return dbEmployee;
    }

    @DeleteMapping("/employees/{EmployeeId}") // Delete Employee By Id
    public String deleteEmployee(@PathVariable int EmployeeId) {
        employeeService.findById(EmployeeId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found"));
        employeeService.deleteById(EmployeeId);

        return "Employee with ID:" + EmployeeId + " deleted";
    }


    @RequestMapping(value = "/employees/{id}", method = RequestMethod.OPTIONS)
    public ResponseEntity<Void> optionsOnEmployee(@PathVariable int id) {
        return ResponseEntity
                .ok()
                .allow(HttpMethod.GET, HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE, HttpMethod.OPTIONS)
                .build();
    }
}