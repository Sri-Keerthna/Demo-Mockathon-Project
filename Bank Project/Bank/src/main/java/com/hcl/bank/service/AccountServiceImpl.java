package com.hcl.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bank.model.Account;
import com.hcl.bank.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	AccountService accountService;

	@Override
	public String accountDetails(Account account) {
		accountRepository.save(account);
		return "Amount added to account successfully";
	}
}
