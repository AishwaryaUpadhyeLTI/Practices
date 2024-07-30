package com.ltimindtreeassignment.bookjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltimindtreeassignment.bookjpa.entity.Book;
import com.ltimindtreeassignment.bookjpa.repository.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
        
    }

    public Book getBookById(Integer id)  {
       
            return bookRepository.findById(id).get();
    }

    

    public Book addBook(Book book) {
        return bookRepository.save(book);
        
    }

    public Book updateBookById(Integer id, Book bookDetails) {
        Book bk=bookRepository.findById(id).get();
        bk=bookDetails;
            return bookRepository.save(bk);
        }
       
    

    public void deleteBookByName(Integer id) {
        Book bk=bookRepository.findById(id).get();
        
      
             bookRepository.delete(bk);
    }

       
    
  

    
}
