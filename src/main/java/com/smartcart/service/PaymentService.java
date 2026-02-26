
package com.smartcart.service;

import java.util.List;
import java.util.Optional;

import com.smartcart.entity.Payment;

public interface PaymentService {
	
	public Payment save_user_details(Payment payment);
	
	List<Payment> save_multiple_user_details(List<Payment>payment);
	
	Optional<Payment> find_one_item_via_Id(Long payment_Id);
	
	List<Payment>find_all_items_by_Id(List<Long>payment_Id);
	
	List<Payment>find_all_items();
	
	public void del_item_by_id(Long payment_Id);
	
	public void del_items_by_id(List<Long>payment_Id);

}

