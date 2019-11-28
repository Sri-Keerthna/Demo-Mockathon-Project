package com.hcl.parking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employspot")
public class EmploySpot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employSpotId;
	private Long employId;
	private Integer spotId;
}
