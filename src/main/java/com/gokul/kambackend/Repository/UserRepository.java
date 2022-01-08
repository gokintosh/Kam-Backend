package com.gokul.kambackend.Repository;

import com.gokul.kambackend.model.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<AppUser, String> {
    Optional<AppUser> findByUsername(String username);
}