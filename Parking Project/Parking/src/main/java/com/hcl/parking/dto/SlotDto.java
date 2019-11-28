package com.hcl.parking.dto;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SlotDto {

	private Integer slotNo;
	private Long employeeId;
	private Date toDate;
}
