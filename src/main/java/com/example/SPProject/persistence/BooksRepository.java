package com.example.SPProject.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.SPProject.models.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
}
