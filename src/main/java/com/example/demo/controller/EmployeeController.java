package com.example.demo.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/employees")
public class EmployeeController {
List<Employee>employees=employeesGenerator();


    @GetMapping("/list")
    public String listEmployees(Model model){
        model.addAttribute("employees",employees);
   return "list-employees";
    }

    @PostConstruct
    private static List<Employee> employeesGenerator() {
        Employee firstEmployee= new Employee(1,"Georgi","Georgiev", "georgiGeorgiev@gmail.com");
        Employee secondEmployee= new Employee(2,"Emma","Emma", "emmaEmma@gmail.com");
        Employee thirdEmployee= new Employee(3,"Tom","Novack", "tomNovack@gmail.com");
        List<Employee>employees=new ArrayList<>();
        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);
    return employees;
    }
}