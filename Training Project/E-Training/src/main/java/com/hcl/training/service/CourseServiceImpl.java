package com.hcl.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.training.exception.CourseIdNotFoundException;
import com.hcl.training.exception.CoursesNotFoundException;
import com.hcl.training.model.Course;
import com.hcl.training.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepository;

	public String registerUser(Course course) {
		courseRepository.save(course);
		return "Registered Successfully";

	}

	@Override
	public List<Course> dispalyAllCourses() throws CoursesNotFoundException {
		List<Course> course = courseRepository.findAll();
		if (course.isEmpty()) {
			throw new CoursesNotFoundException("There is no available courses");
		} else {
			return course;
		}
	}

	@Override
	public Course searchCourse(Integer courseId) throws CourseIdNotFoundException {
		Course course = courseRepository.findCourseBycourseId(courseId);
		if (course == null) {
			throw new CourseIdNotFoundException("Course Id is incorrect");
		} else {
			return course;
		}
	}

	@Override
	public List<Course> getFilterCourses(String courseName) throws CoursesNotFoundException {
		List<Course> Availablecourses = courseRepository.findAll();
		List<Course> courses = new ArrayList<>();
		for (Course courseFetch : Availablecourses) {
			courses.add(courseFetch);
		}
		courses = courses.stream().filter(
				courseDetails -> courseDetails.getCourseName().toLowerCase().startsWith(courseName.toLowerCase()))
				.collect(Collectors.toList());
		if (courses.isEmpty()) {
			throw new CoursesNotFoundException("Course not found");
		}
		return courses;
	}

}
