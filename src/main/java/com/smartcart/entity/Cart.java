package com.smartcart.entity;


//existing entity created by our team member
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Table(name="cart")
//@AllArgsConstructor
//@NoArgsConstructor
//public class Cart {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long  cart_id;
//	@OneToOne
//	@JoinColumn(name="user_id")
//	private User cart_user;
//	
//}


//newly updated 
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(
            mappedBy = "cart",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE},
            orphanRemoval = true
    )
    @JsonManagedReference
    private List<CartItem> cartItems = new ArrayList<>();

    private Double totalPrice = 0.0;
}

