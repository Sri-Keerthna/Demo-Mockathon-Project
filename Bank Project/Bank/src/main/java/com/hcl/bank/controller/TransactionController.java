package com.hcl.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.bank.model.Transaction;
import com.hcl.bank.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	TransactionService transactionService;

	@RequestMapping("/transfer")
	public ResponseEntity<String> transfer(@RequestBody Transaction transaction) {
		return new ResponseEntity<String>(transactionService.transactionDetails(transaction), new HttpHeaders(),
				HttpStatus.OK);
	}

}
