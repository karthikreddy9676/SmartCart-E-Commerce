package com.smartcart.service;


import com.smartcart.dto.UserDTO;


public interface UserService {
    UserDTO fetchCurrentlyLoggedInUserDetails();

    UserDTO updateUserDetails(UserDTO userDTO, Long userId);
}
