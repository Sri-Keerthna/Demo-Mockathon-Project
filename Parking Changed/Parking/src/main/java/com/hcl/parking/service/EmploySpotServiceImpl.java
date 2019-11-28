package com.hcl.parking.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.parking.dto.EmploySpotDto;
import com.hcl.parking.entity.Employ;
import com.hcl.parking.entity.EmploySpot;
import com.hcl.parking.entity.ParkingSpot;
import com.hcl.parking.repository.EmployRepository;
import com.hcl.parking.repository.EmploySpotRepository;
import com.hcl.parking.repository.ParkingSpotRepository;

@Service
public class EmploySpotServiceImpl implements EmploySpotService {

	@Autowired
	ParkingSpotRepository parkingSpotRepository;

	@Autowired
	EmploySpotRepository employSpotRepository;

	@Autowired
	EmployRepository employRepository;

	@Transactional
	public String spotRelease(EmploySpotDto employSpotDto) {
		ParkingSpot parkingSpot = parkingSpotRepository.findByEmployId(employSpotDto.getEmployId());
		Employ employ = employRepository.findEmployByEmployId(employSpotDto.getEmployId());
		ParkingSpot parkingSpot1 = parkingSpotRepository.findBySpotId(employSpotDto.getSpotId());
		if (parkingSpot.getEmployId().equals(employ.getEmployId())
				&& parkingSpot.getSpotId().equals(employSpotDto.getSpotId())) {
			EmploySpot employSpot = new EmploySpot();
			if (employSpot.getSpotId() != employSpotDto.getSpotId()) {
				employSpot.setEmployId(employSpotDto.getEmployId());
				employSpot.setSpotId(employSpotDto.getSpotId());
				employSpotRepository.save(employSpot);
			}
			return "Released";
		} else {
			return "Not released";
		}
	}

}
