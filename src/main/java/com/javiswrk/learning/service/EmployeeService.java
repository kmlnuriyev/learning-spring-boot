package com.javiswrk.learning.service;

import com.javiswrk.learning.model.Employee;

import java.util.List;

public interface EmployeeService {

    // fetch list of Employees which name starts with
    List<Employee> findEmployeeByEmployeeNameStartingWith(String name);

    // fetch Employees by role
    List<Employee> findEmployeeByEmployeeRole(String role);

    List<Employee> findAll();

    Employee save(Employee employee);

//    void delete(long employeeId);

}
