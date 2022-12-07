package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

/**
 * Created by: Petar.Hristov
 * Date: 07.12.2022
 */
public interface EmployeeService {
    public List<Employee> findAll();
    public Employee findById(int theId);
    public void save(Employee employee);
    public void deleteById(int id);
}
