package com.hcl.parking.service;

import java.util.List;

import com.hcl.parking.dto.LoginDto;
import com.hcl.parking.entity.Employee;
import com.hcl.parking.entity.ParkingSlot;

public interface EmployeeService {
	
	public String registration(Employee employee);
	
	public List<ParkingSlot> loginAuthenticate(LoginDto loginDto);
}
