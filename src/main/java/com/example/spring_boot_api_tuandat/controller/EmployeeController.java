package com.example.spring_boot_api_tuandat.controller;

import com.example.spring_boot_api_tuandat.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;
}
