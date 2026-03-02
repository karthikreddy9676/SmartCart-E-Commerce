<<<<<<< HEAD
//
//package com.smartcart.service;
//
//import com.smartcart.dto.LoginRequestDTO;
//import com.smartcart.dto.LoginResponseDTO;
//
//public interface AuthService {
//
//    LoginResponseDTO login(LoginRequestDTO loginRequest);
//}
=======
package com.smartcart.service;

import com.smartcart.dto.*;

public interface AuthService {

    AuthResponse register(RegisterRequest request);

    AuthResponse login(LoginRequest request);
}
>>>>>>> branch 'master' of https://github.com/karthikreddy9676/SmartCart-E-Commerce.git
