package com.smartcart.serviceimpl;

import java.util.List;

import java.util.Optional;



import com.smartcart.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcart.entity.Cart;
import com.smartcart.repository.Ismartcart_CartRepository;
import com.smartcart.service.Iservice_cart;

@Service
public class CartServiceImpl implements Iservice_cart {
	
	@Autowired
	private Ismartcart_CartRepository cart_repo;

	@Override
	public Cart saveAll_cart_items(Cart cart) {
		
		return cart_repo.save(cart) ;
	}

	@Override
	public List<Cart> save_multiple_items_into_cart(List<Cart> cart) {
		// TODO Auto-generated method stub
		return cart_repo.saveAll(cart);
	}

	@Override
	public Optional<Cart> find_one_item_via_Id(Long cart_Id) {
		// TODO Auto-generated method stub
		return cart_repo.findById(cart_Id);
	}

	@Override
	public List<Cart> find_all_items_by_Id(List<Long> cart_Ids) {
		// TODO Auto-generated method stub
		return cart_repo.findAll();
	}

	@Override
	public List<Cart> find_all_items() {
		// TODO Auto-generated method stub
		return cart_repo.findAll();
	}

	@Override
	public void del_item_by_id(Long cart_Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void del_items_by_id(List<Long> cart_Ids) {
		// TODO Auto-generated method stub
		
	}


}
