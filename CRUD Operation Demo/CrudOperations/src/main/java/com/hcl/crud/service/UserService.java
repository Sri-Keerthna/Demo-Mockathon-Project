package com.hcl.crud.service;

import java.util.List;
import java.util.Optional;

import com.hcl.crud.entity.User;

public interface UserService {

	String saveUser(User user);
	
	List<User> showAllUsers();
	
	Optional<User> findById(Integer Id);
	
	String updateUser(Integer userId);
}
