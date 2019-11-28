package com.hcl.training.model;


import java.util.Date;

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
@Table(name = "enrollment")
@SequenceGenerator(name = "sequence", initialValue = 1001)
public class Enrollment {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
	private Integer enrollId;
	private Integer userId;
	private String courseName;
	private String authorName;
	private Date enrollDate;
	private Integer courseDuration;
}
