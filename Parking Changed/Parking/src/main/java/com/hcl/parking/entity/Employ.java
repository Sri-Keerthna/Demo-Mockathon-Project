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
@Table(name = "employ")
public class Employ {

	@Id
	private Long employId;
	private String employName;
	private String userName;
	private String passWord;
	private Integer experience;
	private Long phoneNo;

}
