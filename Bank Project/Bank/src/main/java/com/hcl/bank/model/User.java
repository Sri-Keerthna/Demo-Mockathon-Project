package com.hcl.bank.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user")
@SequenceGenerator(name = "sequence", initialValue = 100000001)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
	private Long accountNo;
	private String accountType;
	private String userName;
	private String passWord;
	private String gender;
	private Date dob;
	private long phoneNo;
	private String email;

}
