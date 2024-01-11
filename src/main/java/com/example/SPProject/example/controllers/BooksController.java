package com.example.SPProject.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.SPProject.command.CreateBookCommand;
import com.example.SPProject.models.*;
import com.example.SPProject.persistence.BooksRepository;

@RestController
@RequestMapping("/api/books")
public class BooksController {

    private final BooksRepository booksRepository;

    @Autowired
    public BooksController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @PostMapping
    public Book createBook(@RequestBody CreateBookCommand command) {
        Book book = new Book();
        // Set properties on book using command

        // Save the book using the repository
        book = booksRepository.save(book);

        return book;
    }
}
