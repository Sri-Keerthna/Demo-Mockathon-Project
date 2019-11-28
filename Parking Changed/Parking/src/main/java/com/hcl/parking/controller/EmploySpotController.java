package com.hcl.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.parking.dto.EmploySpotDto;
import com.hcl.parking.entity.EmploySpot;
import com.hcl.parking.service.EmploySpotServiceImpl;

@RestController
@RequestMapping("/employspot")
public class EmploySpotController {

	@Autowired
	EmploySpotServiceImpl employSpotService;
	
	@PostMapping("/spot")
	public ResponseEntity<String> spotRelease(@RequestBody EmploySpotDto employSpotDto){
		String spot=employSpotService.spotRelease(employSpotDto);
		return new ResponseEntity<String>(spot,HttpStatus.CREATED);
	}
}
