package com.smartcart.service;

import com.smartcart.dto.RegisterRequest;

public interface IUser {
	
	String registerUser(RegisterRequest req);
}
