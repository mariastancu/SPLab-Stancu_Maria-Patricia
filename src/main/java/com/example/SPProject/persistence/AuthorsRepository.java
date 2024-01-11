package com.example.SPProject.persistence;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SPProject.models.Author;

public interface AuthorsRepository extends JpaRepository<Author, Integer> {
}
