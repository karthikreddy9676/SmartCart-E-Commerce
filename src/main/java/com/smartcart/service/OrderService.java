
package com.smartcart.service;

import java.util.List;
import java.util.Optional;

import com.smartcart.entity.Order;


public interface OrderService {
	
public Order save_order_details(Order order);
	
	List<Order> save_multiple_order_details(List<Order>order);
	
	Optional<Order> find_order_via_Id(Long order_Id);
	
	List<Order>find_all_orders_by_Id(List<Long>order_Id);
	
	List<Order>find_all_orders();
	
	public void del_order_by_id(Long order_Id);
	
	public void del_order_by_id(List<Long>order_Id);

}

