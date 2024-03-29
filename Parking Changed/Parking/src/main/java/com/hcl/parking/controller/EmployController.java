package com.hcl.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.parking.entity.Employ;
import com.hcl.parking.service.EmployServiceImpl;

@RestController
@RequestMapping("/employ")
public class EmployController {

	@Autowired
	EmployServiceImpl employService;

	@PostMapping("/new")
	public ResponseEntity<String> employRegister(@RequestBody Employ employ){
		String register=employService.saveEmploy(employ);
		return new ResponseEntity<String>(register,HttpStatus.CREATED);
	}

}
