package com.hcl.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.parking.entity.EmploySpot;
import com.hcl.parking.entity.ParkingSpot;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, Integer>{

	Integer findSpotIdByStatus(String status);

	ParkingSpot findByEmployId(Long employId);

	ParkingSpot findBySpotId(Integer spotId);

}
