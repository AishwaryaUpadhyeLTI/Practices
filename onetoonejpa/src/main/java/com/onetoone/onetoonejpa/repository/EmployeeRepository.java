package com.onetoone.onetoonejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.onetoonejpa.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    
}
