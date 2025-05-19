package com.example.employeepayrollapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeePayrollController {

    @GetMapping("/")
    public String welcomeMessage() {
        return "Welcome to Spring Boot Employee Payroll App using MySQL";
    }
}