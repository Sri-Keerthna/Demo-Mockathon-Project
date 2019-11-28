package com.hcl.parking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.parking.dto.LoginDto;
import com.hcl.parking.entity.Employee;
import com.hcl.parking.entity.ParkingSlot;
import com.hcl.parking.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeService;

	@PostMapping("/new")
	ResponseEntity<String> employRegister(@RequestBody Employee employee){
		String employ=employeeService.registration(employee);
		return new ResponseEntity<String>(employ,HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	ResponseEntity<List<ParkingSlot>> employLogin(LoginDto loginDto) {
		List<ParkingSlot> employ=employeeService.loginAuthenticate(loginDto);
		return new ResponseEntity<List<ParkingSlot>>(employ,HttpStatus.OK);
	}
}
