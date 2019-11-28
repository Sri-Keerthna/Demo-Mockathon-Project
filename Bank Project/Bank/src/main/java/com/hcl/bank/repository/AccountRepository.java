package com.hcl.bank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.bank.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {

	Account findAccountByAccountNo(Long accountNo);

}
