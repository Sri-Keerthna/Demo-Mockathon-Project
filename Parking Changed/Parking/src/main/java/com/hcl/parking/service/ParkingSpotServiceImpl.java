package com.hcl.parking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.parking.entity.Employ;
import com.hcl.parking.entity.ParkingSpot;
import com.hcl.parking.repository.EmployRepository;
import com.hcl.parking.repository.EmploySpotRepository;
import com.hcl.parking.repository.ParkingSpotRepository;

@Service
public class ParkingSpotServiceImpl implements ParkingSpotService {

	@Autowired
	ParkingSpotRepository parkingSpotRepository;

	@Autowired
	EmployRepository employRepository;

	@Autowired
	EmploySpotRepository employSpotRepository;

	@Override
	public String saveSpot(ParkingSpot parkingSpot) {
		parkingSpotRepository.save(parkingSpot);
		return "Spot Saved";
	}

	@Override
	public String spotEmploy(Long employId) {
		Employ employ = employRepository.findByEmployId(employId);
		if (employ.getExperience() > 15) {
			ParkingSpot parkingSpot = new ParkingSpot();
			parkingSpot.setEmployId(employId);
			parkingSpot.setStatus("Occupied");
			parkingSpot.setSpotName("Tower " + employ.getExperience());
			parkingSpotRepository.save(parkingSpot);
			return "Spot allocated for owner";
		} else {

			return "not allocated";
		}
	}

}
