//package com.smartcart.repository;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.smartcart.entity.Order;
//import com.smartcart.entity.User;
//
//public interface Ismartcart_OrderRepository extends JpaRepository<Order, Long> {
//
//
//	public interface OrderRepository extends JpaRepository<Order, Long> {
//
//	    // Get all orders of a user
//	    List<Order> findByUser(User user);
//
//	    // Get all orders by user ID
//	    List<Order> findByUserId(Long user_Id);
//
//	    // Get latest order of a user (based on order_Id)
//	    Optional<Order> findTopByUserOrderByOrder_IdDesc(User user);
//
//	    // Check if user has any orders
//	    boolean existsByUser(User user);
//
//	    // Delete all orders of a user (rare but useful)
//	    void deleteByUser(User user);
//
//	   List<Order> findByUserAndStatus(User user, String status);
//	   
//	   List<Order> findByUserOrderByOrderDateDesc(User user);
//	}
//}
