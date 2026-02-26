package com.smartcart.serviceimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.smartcart.entity.User;
import com.smartcart.repository.Ismartcart_UserRepository;
import com.smartcart.service.UserService;



import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private Ismartcart_UserRepository user_repo;
	@Override
	public User save_user_details(User user) {
		// TODO Auto-generated method stub
		return user_repo.save(user);
	}

	@Override
	public List<User> save_multiple_user_details(List<User> user) {
		// TODO Auto-generated method stub
		return user_repo.saveAll(user);
	}

	@Override
	public Optional<User> find_user_via_Id(Long user_Id) {
		// TODO Auto-generated method stub
		return user_repo.findById(user_Id);
	}

	@Override
	public List<User> find_all_user_by_Id(List<Long> user_Id) {
		// TODO Auto-generated method stub
		return user_repo.findAllById(user_Id);
	}

	@Override
	public List<User> find_all_user() {
		// TODO Auto-generated method stub
		return user_repo.findAll();
	}

	@Override
	public void del_user_by_id(Long user_Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void del_user_by_id(List<Long> user_Id) {
		// TODO Auto-generated method stub
		
	}



	
}
