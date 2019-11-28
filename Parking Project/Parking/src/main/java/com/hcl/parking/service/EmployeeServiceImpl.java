package com.hcl.parking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.parking.dto.LoginDto;
import com.hcl.parking.entity.Employee;
import com.hcl.parking.entity.ParkingSlot;
import com.hcl.parking.repository.EmployeeRepository;
import com.hcl.parking.repository.ParkingSlotRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ParkingSlotRepository parkingSlotRepository;

	@Override
	public String registration(Employee employee) {
		employeeRepository.save(employee);
			return "Registered Successfully";
	}

	@Override
	public List<ParkingSlot> loginAuthenticate(LoginDto loginDto) {
		String name = loginDto.getUserName();
		String secrerCode = loginDto.getPassWord();
		Employee employ = employeeRepository.findEmployeeByUserName(name);
		if (employ.getUserName().equals(name) && employ.getPassWord().equals(secrerCode)) {
		String parkingStatus="release";
			return parkingSlotRepository.findSlotNoByParkingStatus(parkingStatus);
		} else {
			return null;
		}
	}
	

}
