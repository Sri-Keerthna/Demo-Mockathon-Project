package com.hcl.training.model;


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
@Table(name = "course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer courseId;
	private String courseName;
	private String authorName;
	private Integer courseDuration;
	private Long amount;
	
}
