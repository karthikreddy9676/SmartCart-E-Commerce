//package com.smartcart.repository;
//
//import java.util.Optional;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.smartcart.entity.Product;
//
//public interface ProductRepository extends JpaRepository<Product, Long> {
//	
//	  Optional<Product> findByProductName(String productName);
//
//	    Page<Product> findByCategory_CategoryId(Long categoryId, Pageable pageable);
//
//	    Page<Product> findByCategory_CategoryName(String categoryName, Pageable pageable);
//
//	    Page<Product> findByProductNameContainingIgnoreCase(String keyword, Pageable pageable);
//
//}
