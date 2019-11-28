package com.hcl.parking.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.parking.dto.ParkingSlotDto;
import com.hcl.parking.dto.SlotDto;
import com.hcl.parking.entity.Employee;
import com.hcl.parking.entity.ParkingSlot;
import com.hcl.parking.repository.EmployeeRepository;
import com.hcl.parking.repository.ParkingSlotRepository;

@Service
public class ParkingSlotServiceImpl implements ParkingSlotService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ParkingSlotRepository parkingSlotRepository;

	@Override
	public String parkingStatus(ParkingSlotDto parkingSlotDto) {
		Integer slotNo=parkingSlotDto.getSlotNo();
		ParkingSlot parkingSlot=parkingSlotRepository.getOne(slotNo);
		Date date = new Date();
		if(date.after(parkingSlotDto.getToDate())) {
		parkingSlot.setEmployeeId(parkingSlotDto.getEmployeeId());
			parkingSlot.setParkingStatus("occupied");
			parkingSlotRepository.save(parkingSlot);	
			return "Occupied";		
	}else {
		parkingSlot.setParkingStatus("release");
		parkingSlotRepository.save(parkingSlot);	
		return "Release";
	}			
}

	@Override
	public String slotAllocate(SlotDto slotDto) {
		boolean employId=parkingSlotRepository.existsByEmployeeId(slotDto.getEmployeeId());
		if(employId==true) {
			return "Already allocated";
		}
		else {
			Integer slotNo=slotDto.getSlotNo();
			ParkingSlot parkingSlot=parkingSlotRepository.getOne(slotNo);
			if(slotDto.getToDate().before(parkingSlot.getDate())){	
		parkingSlot.setEmployeeId(slotDto.getEmployeeId());
			parkingSlot.setSlotNo(slotDto.getSlotNo());
			parkingSlot.setDate(slotDto.getToDate());
			parkingSlot.setParkingStatus("Occupied");
			parkingSlotRepository.save(parkingSlot);
			return "Allocated";
			}else {
				return "Date cant be given";
			}
		}
		
	}

	@Override
	public String slotDetails(Long employeeId) {	
		Employee employ = employeeRepository.findByEmployeeId(employeeId);
		ParkingSlot parkingSlot=new ParkingSlot();
		Date date = new Date();
		if(parkingSlotRepository.existsByEmployeeId(employeeId)) {
			return "Already allocated";
		}
		else {
		if(employ.getEmployExperience()>15&&employ.getEmployeeLevel()<=2) {
			parkingSlot.setEmployeeId(employeeId);
			parkingSlot.setParkingStatus("Occupied");
			parkingSlot.setDate(date);
			parkingSlotRepository.save(parkingSlot);
		return "Slot allocated";
		}
		return "Not allocated";
		}
	}
}

