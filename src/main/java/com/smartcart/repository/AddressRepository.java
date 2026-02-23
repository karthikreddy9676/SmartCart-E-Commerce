package com.smartcart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcart.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	
	 List<Address> findByUser_UserId(Long userId);

}
