package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

/**
 * Created by: Petar.Hristov
 * Date: 07.12.2022
 */
public interface EmployeeService {
     List<Employee> findAll();
     Employee findById(int theId);
     void save(Employee employee);
     void deleteById(int id);
}
