package com.hcl.parking.service;

import com.hcl.parking.entity.ParkingSpot;

public interface ParkingSpotService {

	public String saveSpot(ParkingSpot parkingSpot);

	String spotEmploy(Long employId);
}
