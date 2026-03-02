package com.smartcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.smartcart.dto.AuthResponse;
import com.smartcart.dto.LoginRequest;
import com.smartcart.dto.RegisterRequest;
import com.smartcart.service.AuthService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")  // allows React frontend
public class AuthController {

    @Autowired
    private AuthService service;

    @PostMapping("/register")
    public AuthResponse register(@RequestBody RegisterRequest request) {
        return service.register(request);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request) {
        return service.login(request);
    }
}
