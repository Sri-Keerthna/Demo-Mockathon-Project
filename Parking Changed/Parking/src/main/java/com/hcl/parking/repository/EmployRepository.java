package com.hcl.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.parking.entity.Employ;
import com.hcl.parking.entity.ParkingSpot;

@Repository
public interface EmployRepository extends JpaRepository<Employ, Integer>{

	Employ findEmployByEmployId(Long employId);

	Employ findByEmployId(Long employId);

}
