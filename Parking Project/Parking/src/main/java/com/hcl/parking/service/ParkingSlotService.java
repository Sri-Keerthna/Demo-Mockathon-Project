package com.hcl.parking.service;

import com.hcl.parking.dto.ParkingSlotDto;
import com.hcl.parking.dto.SlotDto;

public interface ParkingSlotService {

	public String parkingStatus(ParkingSlotDto parkingSlotDto);

	String slotAllocate(SlotDto slotDto);
	
	String slotDetails(Long employeeId);

}
