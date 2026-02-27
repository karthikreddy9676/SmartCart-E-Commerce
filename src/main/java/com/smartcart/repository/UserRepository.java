package com.smartcart.repository;

public interface UserRepository  {

<<<<<<< HEAD
=======
import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcart.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

//    Optional<User> findByUserName(String userName);
//
//    boolean existsByUserName(String userName);
//
//    boolean existsByEmail(String email);
	
	Optional<User> findByEmail(String email);
	
	
>>>>>>> branch 'master' of https://github.com/karthikreddy9676/SmartCart-E-Commerce.git

}
