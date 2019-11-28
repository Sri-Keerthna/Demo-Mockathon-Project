package com.hcl.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.parking.entity.RequestSpot;
import com.hcl.parking.service.RequestSpotServiceImpl;

@RestController
@RequestMapping("/requestspot")
public class RequestSpotController {

	@Autowired
	RequestSpotServiceImpl requestSpotService;
	
	@PostMapping("/spot")
	public ResponseEntity<String> spotRequest(@RequestBody RequestSpot requestSpot){
		String spot=requestSpotService.spotRequest(requestSpot);
		return new ResponseEntity<String>(spot,HttpStatus.CREATED);
	}
}
