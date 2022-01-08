package com.gokul.kambackend.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class AppUser {
    @Id
    private String id;
    private String username;
    private String password;
}
