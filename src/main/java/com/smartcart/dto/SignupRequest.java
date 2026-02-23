package com.smartcart.dto;


import lombok.Data;

import java.util.Set;

@Data
public class SignupRequest {

    private String username;

    
    private String email;

    private Set<String> role;

    
    private String password;

    public Set<String> getRole() {
        return this.role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }
}