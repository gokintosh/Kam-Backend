package com.gokul.kambackend.model.request;

import lombok.Data;

@Data
public class CreateUseRequest {
    private String username;
    private String password;
}
