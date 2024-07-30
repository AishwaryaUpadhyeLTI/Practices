package com.collectionpractice.arraylist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.collectionpractice.arraylist.InvalidSalaryException.InvalidSalaryException;
import com.collectionpractice.arraylist.model.Employee;

@Service
public class EmployeeService {

   private final  List<Employee> emplist=new ArrayList<>();

   public List<Employee> getallEmployees(){
    return emplist;
   }

   public Employee getEmployeeById(int id){
    for (Employee emp: emplist){
        if(emp.getId()==(id)){
            return emp;
        }
    }
    return null;
   }

   public Employee addEmployee(Employee employee) throws InvalidSalaryException{
    if(employee.getSalary() < 0){
        throw new InvalidSalaryException("Invalid");
        
     }
     else{
     emplist.add(employee);
     return employee;
     }


   }
    
}
