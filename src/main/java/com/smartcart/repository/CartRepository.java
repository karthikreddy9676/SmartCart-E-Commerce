<<<<<<< HEAD

package com.smartcart.repository;

public interface CartRepository {

}
=======
package com.smartcart.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcart.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
	
	Optional<Cart> findByUser_Email(String email);

    Optional<Cart> findByUser_UserId(Long userId);

}
>>>>>>> branch 'master' of https://github.com/karthikreddy9676/SmartCart-E-Commerce.git
