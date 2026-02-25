package com.smartcart.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.smartcart.entity.Payment;
import com.smartcart.repository.Ismartcart_PaymentRepository;
import com.smartcart.service.PaymentService;

public class PaymentServiceImpl  implements PaymentService{
	@Autowired
	 private Ismartcart_PaymentRepository payment_repo;

	@Override
	public Payment save_user_details(Payment payment) {
		// TODO Auto-generated method stub
		return payment_repo.save(payment);
	}

	@Override
	public List<Payment> save_multiple_user_details(List<Payment> payment) {
		// TODO Auto-generated method stub
		return payment_repo.saveAll(payment);
	}

	@Override
	public Optional<Payment> find_one_item_via_Id(Long payment_Id) {
		// TODO Auto-generated method stub
		return payment_repo.findById(payment_Id);
	}

	@Override
	public List<Payment> find_all_items_by_Id(List<Long> payment_Id) {
		// TODO Auto-generated method stub
		return payment_repo.findAllById(payment_Id);
	}

	@Override
	public List<Payment> find_all_items() {
		// TODO Auto-generated method stub
		return payment_repo.findAll();
	}

	@Override
	public void del_item_by_id(Long payment_Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void del_items_by_id(List<Long> payment_Id) {
		// TODO Auto-generated method stub
		
	}

}
