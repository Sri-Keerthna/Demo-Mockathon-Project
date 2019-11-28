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
@Table(name = "parkingslot")
public class ParkingSlot {

	@Id
	private Integer slotNo;
	private Long employeeId;
	private String parkingStatus;
	private Date date;
}
