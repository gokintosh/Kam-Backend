package com.gokul.kambackend.repository;

import com.gokul.kambackend.model.Book;
import com.gokul.kambackend.model.Lend;
import com.gokul.kambackend.model.LendStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface Lendrepository extends MongoRepository<Lend,String> {

    Optional<Lend>findByBookAndStatus(Book book, LendStatus status);
}
