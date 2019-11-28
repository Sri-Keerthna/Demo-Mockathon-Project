package com.hcl.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.training.dto.UserDto;
import com.hcl.training.exception.UserValidationException;
import com.hcl.training.model.Enrollment;
import com.hcl.training.model.User;
import com.hcl.training.service.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserServiceImpl userService;

	@PostMapping(value = "/login")
	public ResponseEntity<Enrollment> loginUser(@RequestBody User user) throws UserValidationException {
		Enrollment enrollment = userService.loginAuthenticate(user);
		return new ResponseEntity<Enrollment>(enrollment, HttpStatus.OK);
	}

	@PostMapping(value = "/loginCreation")
	public ResponseEntity<String> loginCreation(@RequestBody UserDto userDto) {
		String login = userService.createLogin(userDto);
		return new ResponseEntity<String>(login, HttpStatus.OK);
	}
}
