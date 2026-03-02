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