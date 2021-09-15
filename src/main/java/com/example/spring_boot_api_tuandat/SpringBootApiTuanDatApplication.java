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
    //Save
    private void insertEmployees(EmployeeRepository repository){
        Employee employee = Employee.builder()
                .firstName("Tuan")
                .lastName("Dat")
                .email("vanteonguyen955@gmail.com")
                .build();
        repository.save(employee);
    }

    @Bean
    public CommandLineRunner run(EmployeeRepository repository) {
        return (args) -> {
            insertEmployees(repository);
            System.out.println(repository.findAll());
            System.out.println(repository.findEmployeeByLastName("Dat"));
        };
    }
}
