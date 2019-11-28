package com.hcl.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.parking.service.AvailableSpotServiceImpl;

@RestController
@RequestMapping("/availableSpot")
public class AvailableController {

	@Autowired
	AvailableSpotServiceImpl availableSpotService;
	
	
}
