//package com.smartcart.serviceimpl;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.smartcart.entity.Order;
//import com.smartcart.repository.Ismartcart_OrderRepository.OrderRepository;
//import com.smartcart.service.OrderService;
//
//public class OrderServiceImpl implements OrderService {
//	@Autowired
//	private OrderRepository order_repo;
//
//	@Override
//	public Order save_order_details(Order order) {
//		// TODO Auto-generated method stub
//		return order_repo.save(order);
//	}
//
//	@Override
//	public List<Order> save_multiple_order_details(List<Order> order) {
//		// TODO Auto-generated method stub
//		return order_repo.saveAll(order);
//	}
//
//	@Override
//	public Optional<Order> find_order_via_Id(Long order_Id) {
//		// TODO Auto-generated method stub
//		return order_repo.findById(order_Id);
//	}
//
//	@Override
//	public List<Order> find_all_orders_by_Id(List<Long> order_Id) {
//		// TODO Auto-generated method stub
//		return order_repo.findAllById(order_Id);
//	}
//
//	@Override
//	public List<Order> find_all_orders() {
//		// TODO Auto-generated method stub
//		return order_repo.findAll();
//	}
//
//	@Override
//	public void del_order_by_id(Long order_Id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void del_order_by_id(List<Long> order_Id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
