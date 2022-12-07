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

    //add a method to sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();

}
