package com.hcl.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.parking.entity.ParkingSpot;
import com.hcl.parking.service.EmploySpotServiceImpl;
import com.hcl.parking.service.ParkingSpotServiceImpl;

@RestController
@RequestMapping("/parkingspot")
public class ParkingSpotController {

	@Autowired
	ParkingSpotServiceImpl parkingSpotService;
	
	@GetMapping("/")
	public ResponseEntity<String> spotEmployee(@RequestParam Long employId) {
		String details=parkingSpotService.spotEmploy(employId);
		return new ResponseEntity<String>(details,HttpStatus.OK);
	}
	
}
