//package com.smartcart.service;
//
//
//import java.util.List;
//import java.util.Optional;
//
//import com.smartcart.entity.User;
//
//
//
//public interface UserService {
//
//	
//public User save_user_details(User user);
//	
//	  public List<User> save_multiple_user_details(List<User>user);
//	
//	  public Optional<User> find_user_via_Id(Long user_Id);
//	
//	  public List<User>find_all_user_by_Id(List<Long>user_Id);
//	
//	  public List<User>find_all_user();
//	
//	public void del_user_by_id(Long user_Id);
//	
//	public void del_user_by_id(List<Long>user_Id);
//
//}

package com.smartcart.service;

import com.smartcart.dto.UserDTO;
import com.smartcart.entity.User;

import java.util.List;

public interface UserService {

    User registerUser(UserDTO userDTO);

    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteUser(Long id);
}
