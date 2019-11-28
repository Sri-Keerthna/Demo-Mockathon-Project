package com.hcl.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.parking.dto.ParkingSlotDto;
import com.hcl.parking.dto.SlotDto;
import com.hcl.parking.service.ParkingSlotServiceImpl;

@RestController
@RequestMapping("/parkingSlot")
public class ParkingSlotController {

	@Autowired
	ParkingSlotServiceImpl parkingSlotService;
	
	@PostMapping("/slotDetails")
	ResponseEntity<String> slotRelease(ParkingSlotDto parkingSlotDto) {
		String details=parkingSlotService.parkingStatus(parkingSlotDto);
		return new ResponseEntity<String>(details,HttpStatus.OK);
	}
	
	@PostMapping("/slot")
	ResponseEntity<String> slotBooking(SlotDto slotDto) {
		String details=parkingSlotService.slotAllocate(slotDto);
		return new ResponseEntity<String>(details,HttpStatus.OK);
	}
	
	@GetMapping("/")
	ResponseEntity<String> parkingDetails(Long employeeId) {
		String details=parkingSlotService.slotDetails(employeeId);
		return new ResponseEntity<String>(details,HttpStatus.OK);
	}
}
