package com.smartcart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {

    private Integer userId;
    private String userName;
    private String email;
    private String message;
}