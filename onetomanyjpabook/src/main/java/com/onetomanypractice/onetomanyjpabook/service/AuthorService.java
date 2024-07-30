package com.onetomanypractice.onetomanyjpabook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetomanypractice.onetomanyjpabook.entity.Author;
import com.onetomanypractice.onetomanyjpabook.entity.Book;
import com.onetomanypractice.onetomanyjpabook.repository.AuthorRepository;
import com.onetomanypractice.onetomanyjpabook.repository.BookRepository;

@Service 
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Integer authorId, Book book){
        Author author=authorRepository.findById(authorId).get();
        if(author!=null){
            book.setAuthor(author);
            return book;
        }
        return null;
        
    }

    public Book getBookById(Integer bookId){
        return bookRepository.findById(bookId).get();

    }
    
}
