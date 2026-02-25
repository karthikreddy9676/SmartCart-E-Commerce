package com.smartcart.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "order_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemId;

    // order reference
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    // product purchased
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    // quantity ordered
    @Column(nullable = false)
    private Integer quantity;

    // price at time of purchase
    @Column(nullable = false)
    private Double price;

    // total price for this item
    @Column(nullable = false)
    private Double totalPrice;

}

