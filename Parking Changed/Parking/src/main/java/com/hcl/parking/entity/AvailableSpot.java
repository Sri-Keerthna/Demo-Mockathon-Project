package com.hcl.parking.entity;

import java.util.Date;

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
@Table(name = "availablespot")
public class AvailableSpot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer availableSpotId;
	private Integer releaseEmployId;
	private Integer spotId;
	private Date date;
	private String status;
	private Long temporaryEmployId;
}
