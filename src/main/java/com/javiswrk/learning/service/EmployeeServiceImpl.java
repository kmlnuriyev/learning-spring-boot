package com.javiswrk.learning.service;

import com.javiswrk.learning.dao.EmployeeDao;
import com.javiswrk.learning.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public List<Employee> findEmployeeByEmployeeNameStartingWith(String name) {
        return employeeDao.findEmployeeByEmployeeNameStartingWith(name);
    }

    @Override
    public List<Employee> findEmployeeByEmployeeRole(String role) {
        return employeeDao.findEmployeeByEmployeeRole(role);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return employeeDao.save(employee);
    }

    /*@Override
    public void delete(long employeeId) {

        Employee employee = employeeDao.findById(employeeId);
        employeeDao.delete(employee);
    }*/
}
