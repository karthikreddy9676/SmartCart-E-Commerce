package com.smartcart.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcart.entity.RegisterLogin;
import com.smartcart.entity.UserLogin;

public interface UserRepository extends JpaRepository<RegisterLogin, Long> {

	Optional<RegisterLogin> findByEmail(String email);
	boolean existsByEmail(String email);
	Optional<UserLogin> findByEmailUser(String email);
}
