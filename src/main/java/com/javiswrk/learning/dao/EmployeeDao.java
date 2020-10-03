package com.javiswrk.learning.dao;

import com.javiswrk.learning.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface EmployeeDao extends CrudRepository<Employee, Long> {

    // fetch list of Employee which start with
    List<Employee> findEmployeeByEmployeeNameStartingWith(String name);

    // fetch Employee by role
    List<Employee> findEmployeeByEmployeeRole(String role);

    // fetch all Employee
    List<Employee> findAll();
}
