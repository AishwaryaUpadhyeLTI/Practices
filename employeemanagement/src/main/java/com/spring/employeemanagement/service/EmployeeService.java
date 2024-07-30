package com.spring.employeemanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.employeemanagement.model.Employee;

@Service
public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();
    public List<Employee> getAllEmployees() {
        
        return employees;
    }
 
    public Employee getEmployeeById(int id) {
     // get employee by id
     for(Employee emp:employees ){
        if(emp.getEmployeeId()==(id)){
            return emp;
 
        }
       
     }
    return null;
    }
 
    public Employee registerEmployee(Employee employee) {
        // add an employee
        employees.add(employee);
        return employee;
 
    }
   
}
    
