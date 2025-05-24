package com.example.employeepayrollapp.dto;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id;
    private String name;
    private String department;
    private Double salary;

}