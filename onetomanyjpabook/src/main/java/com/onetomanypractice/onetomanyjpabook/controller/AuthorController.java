package com.onetomanypractice.onetomanyjpabook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetomanypractice.onetomanyjpabook.entity.Book;
import com.onetomanypractice.onetomanyjpabook.service.AuthorService;

@RestController
@RequestMapping("/books")
public class AuthorController  {

    @Autowired
    private AuthorService authorService;

    @PostMapping
    public ResponseEntity<Book> createBook(@PathVariable Integer authorId,@RequestBody Book book){
        return new ResponseEntity<Book>(authorService.createBook(authorId, book),HttpStatus.OK);
        
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Book> getBookById(Integer bookId){
        return new ResponseEntity<>(authorService.getBookById(bookId),HttpStatus.OK);

    }


    
}
