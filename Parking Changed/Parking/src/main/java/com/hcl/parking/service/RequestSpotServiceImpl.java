package com.hcl.parking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.parking.entity.RequestSpot;
import com.hcl.parking.repository.RequestSpotRepository;

@Service
public class RequestSpotServiceImpl implements RequestSpotService {

	@Autowired
	RequestSpotRepository releaseSpotRepository;
	
	@Override
	public String spotRequest(RequestSpot requestSpot) {
		releaseSpotRepository.save(requestSpot);
		return "Request sent";
	}

}
