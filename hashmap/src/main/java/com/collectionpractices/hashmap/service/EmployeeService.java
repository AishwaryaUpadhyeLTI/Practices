package com.collectionpractices.hashmap.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.collectionpractices.hashmap.model.Employee;

@Service
public class EmployeeService {
   private final HashMap<Integer,Employee> empmap=new HashMap<>();

   public List<Employee> getAllEmployee(){
    List<Employee> emplist=new ArrayList<>(empmap.values());
    return emplist;
   }

   public Employee getEmployeeById(int id){
    for(Map.Entry<Integer,Employee> emp: empmap.entrySet()){
        if(emp.getKey()==(id)){
            return emp.getValue();

        }
        

    }
    return null;
   }

   public Employee addEmployee(Employee employee){
    
    return empmap.put(employee.getId(), employee);

   }
    
}
