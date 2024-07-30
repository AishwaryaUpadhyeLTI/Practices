package com.onetoone.onetoonejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoone.onetoonejpa.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Long> {
    
}
