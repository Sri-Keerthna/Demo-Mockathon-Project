package com.hcl.training.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.training.dto.EnrollmentDto;
import com.hcl.training.exception.CourseNameNotFoundException;
import com.hcl.training.exception.UserIdNotFoundException;
import com.hcl.training.model.Course;
import com.hcl.training.model.Enrollment;
import com.hcl.training.repository.CourseRepository;
import com.hcl.training.repository.EnrollmentRepository;
import com.hcl.training.repository.UserRepository;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

	@Autowired
	EnrollmentRepository enrollmentRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	UserRepository userRepository;

	public Enrollment findEnrollmentByuserId(Integer userId) {
		return enrollmentRepository.findEnrollmentByuserId(userId);
	}

	@Transactional
	public String enrollCourse(EnrollmentDto enrollmentDto)
			throws UserIdNotFoundException, CourseNameNotFoundException {
		Date joiningDate = new Date();
		Course course = courseRepository.findCourseBycourseName(enrollmentDto.getCourseName());
//		if (enrollmentDto.getUserId() == null) {
//			throw new UserIdNotFoundException("User Id is incorrect");
//		} 
//		if (enrollmentDto.getCourseName() == null) {
//			throw new CourseNameNotFoundException("Course Name is incorrect");
//		} 
		List<Enrollment> enrollment = enrollmentRepository.findByUserIdAndCourseName(enrollmentDto.getUserId(),
				enrollmentDto.getCourseName());
		if (enrollment.isEmpty()) {
			Enrollment enroll = new Enrollment();
			enroll.setUserId(enrollmentDto.getUserId());
			enroll.setCourseName(enrollmentDto.getCourseName());
			enroll.setAuthorName(course.getAuthorName());
			enroll.setCourseDuration(course.getCourseDuration());
			enroll.setEnrollDate(joiningDate);
			enrollmentRepository.save(enroll);
			return "Enrolled Successfully";
		} else {
			return "Already did this course";

		}
	}
}
