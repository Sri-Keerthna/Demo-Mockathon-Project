package com.hcl.crud.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.crud.dto.UserResponseDto;
import com.hcl.crud.entity.User;
import com.hcl.crud.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	ResponseEntity<String> createUser(@RequestBody User user){
		String users=userService.saveUser(user);
		return new ResponseEntity<String>(users,HttpStatus.CREATED);
	}
	
	@GetMapping("/displayUsers")
	UserResponseDto displayAllUsers() {
		UserResponseDto userDto=new UserResponseDto();
		userDto.setStatus(200);
		userDto.setMessage("Success");	
		userDto.setResult(userService.showAllUsers());
		return userDto;
	}
	
	@GetMapping("/displayById")
	ResponseEntity<Optional<User>> displayByUserId(Integer Id){
		Optional<User> users=userService.findById(Id);
		return new ResponseEntity<Optional<User>>(users,HttpStatus.OK);
	}
}
