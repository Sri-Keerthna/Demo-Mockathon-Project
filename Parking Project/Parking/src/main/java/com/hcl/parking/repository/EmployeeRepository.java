package com.hcl.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.parking.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findEmployeeByUserName(String name);

	Employee findByEmployeeId(Long employeeId);

}
