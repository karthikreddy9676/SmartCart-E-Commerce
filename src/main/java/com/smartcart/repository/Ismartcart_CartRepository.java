//package com.smartcart.repository;
//
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.smartcart.entity.Cart;
//import com.smartcart.entity.User;
//
//public interface Ismartcart_CartRepository extends JpaRepository<Cart, Long> {
//	
//	 Optional<Cart> findByUser(User user);
//	 Optional<Cart> findByUserId(long user_Id);
//	 boolean existByUser(User user);
//	 void deleteByUser(User user);
//	 
//	
//
//}
