package com.smartcart.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartcart.dto.LoginRequestDTO;
import com.smartcart.dto.LoginResponseDTO;
import com.smartcart.dto.RegisterRequest;
import com.smartcart.dto.RegisterResponse;
import com.smartcart.service.IUser;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin(origins="*")
public class AuthController {

	private final IUser userService;
	
	@PostMapping
	public RegisterResponse register(@RequestBody RegisterRequest req)
	{
		String message=userService.registerUser(req);
		boolean success=message.equals("User Registered Successfully.....!");
		
		return new RegisterResponse(success,message);
	}
	
	@PostMapping("/login")
    public LoginResponseDTO login(@RequestBody LoginRequestDTO loginDTO) {
        return userService.login(loginDTO);
    }
}
