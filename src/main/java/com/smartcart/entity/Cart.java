//package com.smartcart.entity;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//
//
//@Entity
//@Table(name = "carts")
//
//public class Cart {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long  cart_Id;
//	
//	private User user1;
//	
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long cartId;
//    
//    private double totalPrice;
//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @OneToMany(
//            mappedBy = "cart",
//            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE},
//            orphanRemoval = true
//    )
//    @JsonManagedReference
//    private List<CartItem> cartItems1 = new ArrayList<>();
//
//    private String status; // ACTIVE, CHECKED_OUT, ABANDONED
//
//    private LocalDateTime createdAt;
//
//    // One cart → many cart items
//    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<CartItem> cartItems;
//
//    
//    private Double totalPrice1 = 0.0;
//
//}
//
