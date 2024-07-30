package com.collectionpractices.hashmap.controller;

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

import com.collectionpractices.hashmap.model.Employee;
import com.collectionpractices.hashmap.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired 
    private EmployeeService employeeService;
    
    @GetMapping
    public ResponseEntity <List<Employee>> getAllEmployee(){
        //List<Employee> emplist= employeeService.getAllEmployee();
        return new ResponseEntity<>(employeeService.getAllEmployee(),HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(id),HttpStatus.OK);


    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.addEmployee(employee),HttpStatus.OK);
    }

    
    
}
