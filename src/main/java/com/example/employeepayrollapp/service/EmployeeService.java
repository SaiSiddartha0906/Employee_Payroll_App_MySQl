package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.Employee;
import java.util.List;

public interface EmployeeService {
    Employee addEmployee(EmployeeDTO dto);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, EmployeeDTO dto);
    void deleteEmployee(Long id);
}
