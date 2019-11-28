package com.hcl.parking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.parking.dto.ParkingSlotDto;
import com.hcl.parking.entity.ParkingSlot;

public interface ParkingSlotRepository extends JpaRepository<ParkingSlot, Integer> {

	ParkingSlot findByEmployeeId(Long employeeId);

	List<ParkingSlot> findSlotNoByParkingStatus(String parkingStatus);

	boolean findSlotNoByEmployeeId(Long employeeId);

	boolean existsByEmployeeId(Long employeeId);
}
