package com.gokul.kambackend.model.request;

import lombok.Data;

import java.util.List;

@Data
public class BookLendrequest {
    private List<String> bookIds;
    private String memberId;
}