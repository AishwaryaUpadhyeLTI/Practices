package com.jpa.jpaems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.jpaems.entity.Employee;
import com.jpa.jpaems.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> emplist =employeeService.getAllEmployees();
        return new ResponseEntity<>(emplist,HttpStatus.OK);
        // return all employees with a 200 OK status code
    }
    
    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> getEmployeeByName(@PathVariable Integer id) {
        Employee em=employeeService.getEmployeeById(id);
        if(em==null){
            return new ResponseEntity<>(em,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(em,HttpStatus.OK);
       // return the employee with the given name with a 200 OK status code
        // 404 Not Found if the employee does not exist
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        
        return new ResponseEntity<Employee>(employeeService.addEmployee(employee),HttpStatus.CREATED);
        // add the given employee to the database and return the added employee with a 201 CREATED status code
    }
    
    @PutMapping("/{employeeId}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable Integer id, @RequestBody Employee employeeDetails) {
        Employee em=employeeService.updateEmployeeById(id,employeeDetails);
        if(em==null){
            return new ResponseEntity<>(em,HttpStatus.NOT_FOUND);
        }
        
            return new ResponseEntity<Employee>(em, HttpStatus.OK);
        

        // update the employee with the given name with the given details and return the updated employee with a 200 OK status code
        // 404 Not Found if the employee does not exist
    }
    
    @DeleteMapping("/{employeeId}")
    public ResponseEntity<Void> deleteEmployeeByName(@PathVariable Integer id) {
        Employee em=employeeService.getEmployeeById(id);
        if(em==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        
            employeeService.deleteEmployeeByName(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
           
        

        // delete the employee with the given name and return a 204 NO CONTENT status code
        // 404 Not Found if the employee does not exist
    }

    

    }


    

    



    
