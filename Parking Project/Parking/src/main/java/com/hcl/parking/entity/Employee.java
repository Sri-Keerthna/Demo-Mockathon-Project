package com.hcl.parking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

	@Id
	private Long employeeId;
	private String carNo;
	private String userName;
	private String passWord;
	private Integer employExperience;
	private Integer employeeLevel;

}
