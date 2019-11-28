package com.hcl.parking.service;

import com.hcl.parking.dto.EmploySpotDto;
import com.hcl.parking.entity.EmploySpot;

public interface EmploySpotService {

	public String spotRelease(EmploySpotDto employSpotDto);
}
