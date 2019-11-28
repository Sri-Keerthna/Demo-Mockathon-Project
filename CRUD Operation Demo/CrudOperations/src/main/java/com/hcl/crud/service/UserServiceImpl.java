package com.hcl.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.crud.dto.UserResponseDto;
import com.hcl.crud.entity.User;
import com.hcl.crud.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	@Override
	public String saveUser(User user) {
		userRepository.save(user);
		return "Success";
	}
	@Override
	public List<User> showAllUsers() {
		return userRepository.findAll();	
	}
	@Override
	public Optional<User> findById(Integer Id) {
		return userRepository.findById(Id);
	
	}
	@Override
	public String updateUser(Integer userId) {
		userRepository.save(userId);
		return "Updated";
	}

	
}
