package com.smartcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcart.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

}
