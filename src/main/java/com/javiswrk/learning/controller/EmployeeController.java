package com.javiswrk.learning.controller;

import com.javiswrk.learning.model.Employee;
import com.javiswrk.learning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    // To add new employee
    @PostMapping(value = "save")
    public Employee save(Employee employee) {
        return employeeService.save(employee);
    }

    // List of all employees
    @GetMapping(value = "listEmployee")
    public List<Employee> listEmployee() {
        return employeeService.findAll();
    }

    // Delete specific employee using employee id

    // Search employee start with name

    // Search employee by role
}
