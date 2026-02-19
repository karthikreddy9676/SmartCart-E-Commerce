package com.smartcart.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cart")
@Data
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // One user → one active cart
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private double totalPrice;

    private String status; // ACTIVE, CHECKED_OUT, ABANDONED

    private LocalDateTime createdAt;

    // One cart → many cart items
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> cartItems;

    // Optional: if cart becomes an order
    @OneToOne(mappedBy = "cart")
    private Order order;
}
