package com.smartcart.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    // user who placed the order
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // list of items in this order
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems;

    // total amount of order
    @Column(nullable = false)
    private Double totalAmount;

    // shipping address
    @Column(nullable = false)
    private String shippingAddress;

    // payment method (COD, CARD, UPI etc.)
    private String paymentMethod;


    // date order placed
    private LocalDateTime orderDate;

    // last updated time
    private LocalDateTime updatedAt;

   
}
