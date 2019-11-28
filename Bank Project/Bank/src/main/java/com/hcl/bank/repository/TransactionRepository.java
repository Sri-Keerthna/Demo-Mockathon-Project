package com.hcl.bank.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.bank.model.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

	public List<Transaction> findTransactionByfromAccountNo(Long fromAccountNo);

}
