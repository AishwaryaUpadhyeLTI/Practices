package com.spring.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.employeemanagement.model.Employee;
import com.spring.employeemanagement.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping()
    public ResponseEntity<List<Employee>> getAllEmployees() {
        // return all employee with httpstaus OK
        List<Employee> emplist =employeeService.getAllEmployees();
        return new ResponseEntity<>(emplist,HttpStatus.OK);
 
    }
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
        // return employee by id with httpstatus ok
        // if employee not found return httpstatus notfound
        Employee employee=employeeService.getEmployeeById(id);
        if(employee==null){
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(employee,HttpStatus.OK);
        //return ResponseEntity.ok(employee);
    }
    @PostMapping()
    public ResponseEntity<Employee>  registerEmployee(@RequestBody Employee employee) {
       // add an employee and return added employee with httpstatus ok
       return new ResponseEntity<Employee>(employeeService.registerEmployee(employee),HttpStatus.OK);
 
 
    }
   
}
 

