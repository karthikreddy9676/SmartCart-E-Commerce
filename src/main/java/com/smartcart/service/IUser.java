package com.smartcart.service;

import com.smartcart.dto.LoginRequestDTO;
import com.smartcart.dto.LoginResponseDTO;
import com.smartcart.dto.RegisterRequest;

public interface IUser {
	
	String registerUser(RegisterRequest req);
	LoginResponseDTO login(LoginRequestDTO loginDTO);
}
