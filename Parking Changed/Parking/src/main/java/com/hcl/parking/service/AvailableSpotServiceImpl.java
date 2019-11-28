package com.hcl.parking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.parking.dto.AvailableSpotDto;
import com.hcl.parking.repository.AvailableSpotRepository;
import com.hcl.parking.repository.RequestSpotRepository;

@Service
public class AvailableSpotServiceImpl implements AvailableSpotService{

	@Autowired
	AvailableSpotRepository availableSpotRepository;
	
	@Autowired
	RequestSpotRepository requestSpotRepository;

	@Override
	public String spotAvailable(AvailableSpotDto availableSpotDto) {
		RequestSpot requestSpot=requestSpotRepository.findByEmployId(availableSpotDto.getEmployId());
		availableSpotDto.setEmployId(employId);
		return null;
	}
	
	
}
