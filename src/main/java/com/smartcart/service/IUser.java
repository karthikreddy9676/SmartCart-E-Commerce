package com.smartcart.service;

import com.smartcart.dto.LoginRequest;

public interface IUser {
	
	String registerUser(LoginRequest req);
}
