package com.hcl.parking.dto;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AvailableSpotDto {

	private Date fromDate;
	private Date toDate;
	private Long employId;
	
}
