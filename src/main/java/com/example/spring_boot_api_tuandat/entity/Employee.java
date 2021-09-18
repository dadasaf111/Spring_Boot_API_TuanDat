package com.example.spring_boot_api_tuandat.entity;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Table(name = "tbl_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeID;

    @Column(name= "first_name")
    @NotBlank(message = "Please add first name!")
    @Length(max = 10, min= 1, message = "less than ten and greater than one")
    private String firstName;

    @Column(name= "last_name")
    @NotBlank(message = "Please add last name!")
    @Length(max = 10, min= 1, message = "less than ten and greater than one")
    private String lastName;

    @Column(name= "email")
    @Email(message = "Please input a email!")
    private String email;

}
