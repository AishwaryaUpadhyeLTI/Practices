package com.ltimindtreeassignment.bookjpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltimindtreeassignment.bookjpa.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book ,Integer> {
    
    


    
}
    

