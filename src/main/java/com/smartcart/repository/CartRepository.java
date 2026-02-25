package com.smartcart.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcart.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
	
	Optional<Cart> findByUser_Email(String email);

    Optional<Cart> findByUser_UserId(Long userId);

}
//❤️❤️❤️