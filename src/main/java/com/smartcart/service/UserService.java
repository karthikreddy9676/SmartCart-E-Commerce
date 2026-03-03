package com.smartcart.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.smartcart.dto.LoginRequestDTO;
import com.smartcart.dto.LoginResponseDTO;
import com.smartcart.dto.RegisterRequest;
import com.smartcart.entity.RegisterLogin;
import com.smartcart.entity.UserLogin;
import com.smartcart.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService implements IUser {

	private final UserRepository userRepo;
	
	private final BCryptPasswordEncoder passwordEncoder;
	@Override
	public String registerUser(RegisterRequest req) {
		if(!req.getOldPassword().equals(req.getConfirmPassword())) {
			return "Password Doesn't Match";
		}
		if(userRepo.existsByEmail(req.getEmail())) {
			return "Email Already Registered.....!";
		}
		
		RegisterLogin user=RegisterLogin.builder()
				.fullName(req.getFullName())
				.email(req.getEmail())
				.oldPassword(passwordEncoder.encode(req.getOldPassword()))
				.confirmPassword(passwordEncoder.encode(req.getConfirmPassword()))
				.build();
		
		userRepo.save(user);	
		return "User Registered Successfully.....!";
	}
	@Override
	public LoginResponseDTO login(LoginRequestDTO loginDTO) {
		UserLogin login=userRepo.findByEmailUser(loginDTO.getEmail())
				.orElseThrow(()-> new RuntimeException("User Not Found"));
		if(!login.getPassword().equals(loginDTO.getPassword()))
		{
			throw new RuntimeException("Invalid Password");
		}
		return new LoginResponseDTO(
				login.getId(),
				login.getFullName(),
				login.getEmail(),
				login.getRole()
				);
	}

}
