package com.smartcart.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcart.entity.AppRole;
import com.smartcart.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	Optional<Role> findByRoleName(AppRole roleName);

}
