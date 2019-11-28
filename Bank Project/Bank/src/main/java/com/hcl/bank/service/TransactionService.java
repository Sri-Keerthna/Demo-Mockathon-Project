package com.hcl.bank.service;

import java.util.List;

import com.hcl.bank.model.Transaction;

public interface TransactionService {
	
	String transactionDetails(Transaction transaction);

	List<Transaction> findTransactionByfromAccountNo(Long number);

}
