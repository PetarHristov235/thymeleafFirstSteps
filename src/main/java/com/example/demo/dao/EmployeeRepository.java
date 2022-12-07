package com.example.demo.dao;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Created by: Petar.Hristov
 * Date: 07.12.2022
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Override
    List<Employee> findAll();
}
