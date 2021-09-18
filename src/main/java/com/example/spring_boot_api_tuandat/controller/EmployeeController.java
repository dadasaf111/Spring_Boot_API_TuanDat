package com.example.spring_boot_api_tuandat.controller;

import com.example.spring_boot_api_tuandat.dto.UserDTO;
import com.example.spring_boot_api_tuandat.entity.Employee;
import com.example.spring_boot_api_tuandat.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long employeeId){
        return employeeService.getEmployeeById(employeeId);
    }
    @PutMapping("/employees/{id}")
    public Employee updateEmployeeById(@PathVariable("id") Long employeeId,@RequestBody Employee employee){
        return  employeeService.updateEmployeeById(employeeId,employee);
    }
    @DeleteMapping("/employees/{id}")
    public String deleteById(@PathVariable("id") Long employeeId){
        employeeService.deleteById(employeeId);
        return "Delete Sucessfully!";
    }

    @GetMapping("/employeesDTO")
    public List<UserDTO> getListUsers(){
        List<Employee> list= employeeService.getAllEmployees();
        List<UserDTO> list1= new ArrayList<>();
        for (Employee employee:list) {
            list1.add(new UserDTO(employee));
        }
        return list1;
    }
}
