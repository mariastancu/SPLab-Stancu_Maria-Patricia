package com.example.SPProject.command;
import com.example.SPProject.models.Book;
import com.example.SPProject.persistence.BooksRepository;

public class CreateBookCommand {

    private final BooksRepository booksRepository;

    public CreateBookCommand(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public Book execute() {
        Book book = new Book();
        // Set properties on book

        // Save the book using the repository
        return booksRepository.save(book);
    }
}
