package com.hcl.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.training.dto.EnrollmentDto;
import com.hcl.training.exception.CourseNameNotFoundException;
import com.hcl.training.exception.UserIdNotFoundException;
import com.hcl.training.service.EnrollmentServiceImpl;

@RestController
@RequestMapping("/enroll")
public class EnrollmentController {

	@Autowired
	EnrollmentServiceImpl enrollmentService;

	@PostMapping("/enrollCourse")
	public ResponseEntity<String> courseEnrollment(@RequestBody EnrollmentDto enrollmenDto)
			throws UserIdNotFoundException, CourseNameNotFoundException {
		String enroll = enrollmentService.enrollCourse(enrollmenDto);
		return new ResponseEntity<String>(enroll, HttpStatus.OK);
	}

}
