package com.hcl.parking.service;

import com.hcl.parking.dto.AvailableSpotDto;
import com.hcl.parking.entity.AvailableSpot;

public interface AvailableSpotService {

	public String spotAvailable(AvailableSpotDto availableSpotDto);
}
