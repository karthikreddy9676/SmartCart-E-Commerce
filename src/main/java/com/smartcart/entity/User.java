//package com.smartcart.entity;
//
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
////created newly
//
//
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@Entity
//@Table(name = "users")
//
//public class User {
//	@Id
//	private long user_Id;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long userId;
//   
//    private String userName;
// 
//    private String email;
//   
//    
//    private String password;
//
//    @Getter
//    @Setter
//    @ManyToMany(
//            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
//            fetch = FetchType.EAGER
//    )
//    @JoinTable(
//            name = "user_role",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id")
//    )
//    private Set<Role> roles = new HashSet<>();
//
//    @ToString.Exclude
//    @OneToMany(
//            mappedBy = "user",
//            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
//            
//            orphanRemoval = true
//    )
//    private Set<Product> products;
//
//    @Getter
//    @Setter
//    @OneToMany(
//            mappedBy = "user",
//            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
//            fetch = FetchType.LAZY,
//            orphanRemoval = true
//    )
//    
//    private List<Address> addresses = new ArrayList<>();
//
//    @ToString.Exclude
//    @OneToOne(
//            mappedBy = "user",
//            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
//            orphanRemoval = true
//    )
//    private Cart cart;
//
//    public User(String username, String email, String password) {
//        this.userName = username;
//        this.email = email;
//        this.password = password;
//    }
//
//}


package com.smartcart.entity;

<<<<<<< HEAD
=======
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"roles"})
>>>>>>> branch 'master' of https://github.com/karthikreddy9676/SmartCart-E-Commerce.git
public class User {

<<<<<<< HEAD
=======
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    // Many Users can have many Roles
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();
>>>>>>> branch 'master' of https://github.com/karthikreddy9676/SmartCart-E-Commerce.git
}

