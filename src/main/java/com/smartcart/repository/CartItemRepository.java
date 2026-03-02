//package com.smartcart.repository;
//
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.smartcart.entity.CartItem;
//
//public interface CartItemRepository extends JpaRepository<CartItem, Long> {
//
//	Optional<CartItem> findByCart_CartIdAndProduct_ProductId(Long cartId, Long productId);
//}
