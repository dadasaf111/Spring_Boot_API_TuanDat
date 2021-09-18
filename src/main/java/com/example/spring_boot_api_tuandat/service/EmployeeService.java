package com.example.spring_boot_api_tuandat.service;

import com.example.spring_boot_api_tuandat.entity.Employee;
import com.example.spring_boot_api_tuandat.error.EmployeeNotFoundException;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(Long id) throws EmployeeNotFoundException;
    public void deleteById(Long id);
    public Employee updateEmployeeById(Long id,Employee employee);

}
