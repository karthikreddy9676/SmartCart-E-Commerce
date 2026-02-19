package com.smartcart.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String phone;

    @Column(nullable = false)
    private String password;

    // USER or ADMIN
    @Enumerated(EnumType.STRING)
    private Role role;

    // account active status
    private Boolean enabled = true;

    // address info
    private String address;
    private String city;
    private String state;
   

    // orders placed by user
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Order> orders;

    // account creation time
    private LocalDateTime createdAt;

    // last updated time
    private LocalDateTime updatedAt;

   
}
