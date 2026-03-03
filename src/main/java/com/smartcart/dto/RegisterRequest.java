package com.smartcart.dto;

import lombok.Data;

@Data
public class RegisterRequest 
{
	private String fullName;
	private String email;
	private String oldPassword;
	private String confirmPassword;

}
