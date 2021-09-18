package com.example.spring_boot_api_tuandat;

import com.example.spring_boot_api_tuandat.entity.Employee;
import com.example.spring_boot_api_tuandat.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootApiTuanDatApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApiTuanDatApplication.class, args);
    }
}
