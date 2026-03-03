package com.smartcart.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcart.entity.UserLogin;

public interface UserRepository extends JpaRepository<UserLogin, Long> {

	Optional<UserLogin> findByEmail(String email);
	boolean existsByEmail(String email);
}
