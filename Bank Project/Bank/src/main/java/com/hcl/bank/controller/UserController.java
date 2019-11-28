package com.hcl.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.bank.exception.AccountNoNotFoundException;
import com.hcl.bank.model.Transaction;
import com.hcl.bank.model.User;
import com.hcl.bank.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServiceImpl userService;

	@RequestMapping(value = "/allUsers", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> userList = userService.dispalyAllUsers();
		if (userList.isEmpty()) {
			// logger.info("Stocks are not there");
			return new ResponseEntity<List<User>>(userList, HttpStatus.NOT_FOUND);
		}
//		logger.info("Displaying all stocks");
		return new ResponseEntity<List<User>>(userList, HttpStatus.OK);

	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<String> registration(@RequestBody User user) {
		// logger.info("Successfully Ordered");
		return new ResponseEntity<String>(userService.registerUser(user), new HttpHeaders(), HttpStatus.OK);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<List<Transaction>> loginUser(@RequestBody User user) throws AccountNoNotFoundException {
		// logger.info("Successfully Ordered");
		return new ResponseEntity<List<Transaction>>(userService.loginAuthenticate(user), new HttpHeaders(),
				HttpStatus.OK);
	}

}
