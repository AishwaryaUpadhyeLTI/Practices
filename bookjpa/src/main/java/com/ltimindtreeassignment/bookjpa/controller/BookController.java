package com.ltimindtreeassignment.bookjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltimindtreeassignment.bookjpa.entity.Book;
import com.ltimindtreeassignment.bookjpa.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getAllbooks() {
        List<Book> bklist =bookService.getAllBooks();
        return new ResponseEntity<>(bklist,HttpStatus.OK);
        
    }
    
    @GetMapping("/{bookId}")
    public ResponseEntity<Book> getBookById(@PathVariable Integer id) {
        Book bk=bookService.getBookById(id);
        if(bk==null){
            return new ResponseEntity<>(bk,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bk,HttpStatus.OK);
       // return the employee with the given name with a 200 OK status code
        // 404 Not Found if the employee does not exist
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        
        return new ResponseEntity<Book>(bookService.addBook(book),HttpStatus.CREATED);
        // add the given employee to the database and return the added employee with a 201 CREATED status code
    }
    
    @PutMapping("/{bookId}")
    public ResponseEntity<Book> updateBookById(@PathVariable Integer id, @RequestBody Book bookDetails) {
        Book bk=bookService.updateBookById(id,bookDetails);
        if(bk==null){
            return new ResponseEntity<>(bk,HttpStatus.NOT_FOUND);
        }
        
            return new ResponseEntity<Book>(bk, HttpStatus.OK);
        

        
    }
    
    @DeleteMapping("/{bookId}")
    public ResponseEntity<Void> deleteBookByName(@PathVariable Integer id) {
        Book bk=bookService.getBookById(id);
        if(bk==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        
            bookService.deleteBookByName(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
           
        

        // delete the employee with the given name and return a 204 NO CONTENT status code
        // 404 Not Found if the employee does not exist
    }

    

    }

