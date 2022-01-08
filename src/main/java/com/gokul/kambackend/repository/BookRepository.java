package com.gokul.kambackend.repository;

import com.gokul.kambackend.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BookRepository extends MongoRepository<Book,String> {

    Optional<Book>findByIsbn(String isbn);
}
