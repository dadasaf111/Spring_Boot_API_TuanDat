package com.example.spring_boot_api_tuandat.dto;

import com.example.spring_boot_api_tuandat.entity.Employee;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)

public class EmployeeDTO {

    private String fullName;

    private String email;


    public EmployeeDTO(Employee origin) {
        this.fullName = origin.getFirstName() + " " + origin.getLastName();
        this.email = origin.getEmail();
    }
}
