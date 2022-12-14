package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class DemoController {

    //    create mapping for "/hello"
    @GetMapping("/hello")
    public String sayHello(final Model model){
        model.addAttribute("theDate",new Date());
        return "helloworld";
    }
}
