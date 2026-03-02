<<<<<<< HEAD
//package com.smartcart.serviceimpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.smartcart.dto.LoginRequestDTO;
//import com.smartcart.dto.LoginResponseDTO;
//import com.smartcart.entity.User;
//import com.smartcart.repository.UserRepository;
//import com.smartcart.service.AuthService;
//
//@Service
//public class AuthServiceImpl implements AuthService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public LoginResponseDTO login(LoginRequestDTO loginRequest) {
//
//        User user = userRepository.findByEmail(loginRequest.getEmail())
//                .orElseThrow(() -> new RuntimeException("User not found"));
//
//        // Check password
//        if (!user.getPassword().equals(loginRequest.getPassword())) {
//            throw new RuntimeException("Invalid Password");
//        }
//
//        return new LoginResponseDTO(
//                user.getUserId(),
//                user.getUserName(),
//                user.getEmail(),
//                "Login Successful"
//        );
//    }
//}
=======
package com.smartcart.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcart.dto.*;
import com.smartcart.entity.User;
import com.smartcart.repository.UserRepository;
import com.smartcart.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository repo;

    @Override
    public AuthResponse register(RegisterRequest request) {

        // password match validation
        if (!request.getPassword().equals(request.getConfirmPassword())) {
            throw new RuntimeException("Passwords do not match");
        }

        // email exists check
        if (repo.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("Email already registered");
        }

        // save user
        User user = new User();
        user.setUserName(request.getUserName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        User saved = repo.save(user);

        return new AuthResponse(
                saved.getUserId(),
                saved.getUserName(),
                saved.getEmail(),
                "Account created successfully"
        );
    }

    @Override
    public AuthResponse login(LoginRequest request) {

        User user = repo.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!user.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        return new AuthResponse(
                user.getUserId(),
                user.getUserName(),
                user.getEmail(),
                "Login successful"
        );
    }
}
>>>>>>> branch 'master' of https://github.com/karthikreddy9676/SmartCart-E-Commerce.git
