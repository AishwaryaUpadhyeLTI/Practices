package com.jpa.jpaems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.jpaems.entity.Employee;
import com.jpa.jpaems.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
        // get all employees
    }

    public Employee getEmployeeById(Integer id)  {
       
            return employeeRepository.findById(id).get();
    }
      // get employee by name
        // throw NoSuchEmployeeException if employee not found
    

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
        // add employee
    }

    public Employee updateEmployeeById(Integer id, Employee employeeDetails) {
        Employee em=employeeRepository.findById(id).get();
        em=employeeDetails;
            return employeeRepository.save(em);
        }
       // update employee by name
        // throw NoSuchEmployeeException if employee not found
    

    public void deleteEmployeeByName(Integer id) {
        Employee em=employeeRepository.findById(id).get();
        
      
             employeeRepository.delete(em);
    }

        // delete employee by name
    
    
}    // throw NoSuchEmployeeException if employee not found
    











    

