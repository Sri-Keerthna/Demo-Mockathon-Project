package com.hcl.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bank.exception.AccountNoNotFoundException;
import com.hcl.bank.model.Transaction;
import com.hcl.bank.model.User;
import com.hcl.bank.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	TransactionService transactionService;

	@Override
	public List<User> dispalyAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public String registerUser(User user) {
		userRepository.save(user);
		return "Registered Successfully";
	}

	@Override
	public List<Transaction> loginAuthenticate(User user) throws AccountNoNotFoundException  {
		String name = user.getUserName();
		String secrerCode = user.getPassWord();
		User user1 = userRepository.findUserByuserName(name);
		if (user1.getUserName().equals(name) && user1.getPassWord().equals(secrerCode)) {
			Long number = user1.getAccountNo();
			if(number==0) {
				throw new AccountNoNotFoundException("Account no can't be null");
			}
			return transactionService.findTransactionByfromAccountNo(number);
		} else {
			return null;
		}
	}

	@Override
	public User findUserByuserName(String userName) {
		return userRepository.findUserByuserName(userName);
	}

}
