package com.smartcart.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String userName;

    @Column(unique = true)
    private String email;

    private String password;
<<<<<<< HEAD

//    // Many Users can have many Roles
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "user_role",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id")
//    )
   // private Set<Role> roles = new HashSet<>();
}

=======
}
>>>>>>> branch 'master' of https://github.com/karthikreddy9676/SmartCart-E-Commerce.git
