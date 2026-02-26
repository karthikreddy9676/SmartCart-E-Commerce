
package com.smartcart.service;

import java.util.List;
import java.util.Optional;

import com.smartcart.entity.Product;



public interface  ProductService {
	
public Product save_order_details(Product product);
	
	List<Product> save_multiple_order_details(List<Product>product);
	
	Optional<Product> find_order_via_Id(Long product_Id);
	
	List<Product>find_all_orders_by_Id(List<Long>product_Id);
	
	List<Product>find_all_orders();
	
	public void del_order_by_id(Long product_Id);
	
	public void del_order_by_id(List<Long>product_Id);
}

