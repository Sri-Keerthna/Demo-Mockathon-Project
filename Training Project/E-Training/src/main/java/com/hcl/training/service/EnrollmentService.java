package com.hcl.training.service;

import com.hcl.training.dto.EnrollmentDto;
import com.hcl.training.exception.CourseNameNotFoundException;
import com.hcl.training.exception.UserIdNotFoundException;

public interface EnrollmentService {

	String enrollCourse(EnrollmentDto enrollmentDto) throws UserIdNotFoundException, CourseNameNotFoundException;
}
