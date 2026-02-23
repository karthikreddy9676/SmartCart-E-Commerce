package com.smartcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcart.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
