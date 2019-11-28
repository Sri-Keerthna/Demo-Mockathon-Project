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
@Table(name = "requestspot")
public class RequestSpot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestSpotId;
	private Long requestEmployId;
	private Date fromDate;
	private Date toDate;
}
