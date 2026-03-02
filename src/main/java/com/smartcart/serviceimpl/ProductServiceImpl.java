//package com.smartcart.serviceimpl;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.smartcart.entity.Product;
//import com.smartcart.repository.Ismartcart_ProductRepository;
//import com.smartcart.service.ProductService;
//
//@Service
//public class ProductServiceImpl  implements ProductService{
//	@Autowired
//	private Ismartcart_ProductRepository prod_repo;
//
//	@Override
//	public Product save_order_details(Product product) {
//		// TODO Auto-generated method stub
//		return prod_repo.save(product);
//	}
//
//	@Override
//	public List<Product> save_multiple_order_details(List<Product> product) {
//		// TODO Auto-generated method stub
//		return prod_repo.saveAll(product);
//	}
//
//	@Override
//	public Optional<Product> find_order_via_Id(Long product_Id) {
//		// TODO Auto-generated method stub
//		return prod_repo.findById(product_Id);
//	}
//
//	@Override
//	public List<Product> find_all_orders_by_Id(List<Long> product_Id) {
//		// TODO Auto-generated method stub
//		return prod_repo.findAllById(product_Id);
//	}
//
//	@Override
//	public List<Product> find_all_orders() {
//		// TODO Auto-generated method stub
//		return prod_repo.findAll();
//	}
//
//	@Override
//	public void del_order_by_id(Long product_Id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void del_order_by_id(List<Long> product_Id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
