package com.hcl.bank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bank.model.Account;
import com.hcl.bank.model.Transaction;
import com.hcl.bank.repository.AccountRepository;
import com.hcl.bank.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepository transactionRepository;

	@Autowired
	AccountRepository accountRepository;

	@Transactional
	public String transactionDetails(Transaction transaction) {
		String result = "";
		Account fromAccount = accountRepository.findAccountByAccountNo(transaction.getFromAccountNo());
		Account toAccount = accountRepository.findAccountByAccountNo(transaction.getToAccountNo());
		if(fromAccount==toAccount) {
			result ="Account no can't be same";
		}else {
		transaction.getTransferAmount();
		if (fromAccount.getAccountBalance() > transaction.getTransferAmount()) {
			Long balance = fromAccount.getAccountBalance() - transaction.getTransferAmount();
			fromAccount.setAccountBalance(balance);
			Long finabalance = toAccount.getAccountBalance() + transaction.getTransferAmount();
			toAccount.setAccountBalance(finabalance);
			transactionRepository.save(transaction);
			accountRepository.save(fromAccount);
			accountRepository.save(toAccount);
			result = "Success";
		} 
		else {
			result = "transaction failure";
		}	
	}
		return result;
	}

	@Override
	public List<Transaction> findTransactionByfromAccountNo(Long number) {
		return transactionRepository.findTransactionByfromAccountNo(number);
	}

}
