package com.hcl.parking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.parking.entity.Employ;
import com.hcl.parking.repository.EmployRepository;

@Service
public class EmployServiceImpl implements EmployService {

	@Autowired
	EmployRepository employRepository;

	@Override
	public String saveEmploy(Employ employ) {
		employRepository.save(employ);
		return "Registered";
	}
}
