package com.hcl.parking.dto;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ParkingSlotDto {

	private Integer slotNo;
	private Long employeeId;
	private Date toDate;
	private Date fromDate;
	private String status;
}
