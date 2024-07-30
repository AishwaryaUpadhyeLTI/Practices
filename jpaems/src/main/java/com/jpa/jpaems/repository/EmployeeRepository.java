package com.jpa.jpaems.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.stereotype.Repository;

import com.jpa.jpaems.entity.Employee;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee ,Integer>{

    

    



    
    
}
