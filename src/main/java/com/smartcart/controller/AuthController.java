package com.smartcart.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartcart.dto.LoginRequest;
import com.smartcart.dto.LoginResponse;
import com.smartcart.service.IUser;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin(origins="*")
public class AuthController {

	private final IUser userService;
	
	@PostMapping
	public LoginResponse register(@RequestBody LoginRequest req)
	{
		String message=userService.registerUser(req);
		boolean success=message.equals("User Registered Successfully.....!");
		
		return new LoginResponse(success,message);
	}
}
