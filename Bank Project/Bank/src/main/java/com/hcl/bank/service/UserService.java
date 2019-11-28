package com.hcl.bank.service;

import java.util.List;

import com.hcl.bank.exception.AccountNoNotFoundException;
import com.hcl.bank.model.Transaction;
import com.hcl.bank.model.User;

public interface UserService {

	List<User> dispalyAllUsers();

	String registerUser(User user);

	//String loginAuthenticate(User user);

	User findUserByuserName(String userName);
	
	List<Transaction> loginAuthenticate(User user) throws AccountNoNotFoundException;

}
