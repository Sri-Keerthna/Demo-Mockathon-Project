package com.hcl.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.training.exception.CourseIdNotFoundException;
import com.hcl.training.exception.CoursesNotFoundException;
import com.hcl.training.model.Course;
import com.hcl.training.service.CourseServiceImpl;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	CourseServiceImpl courseService;

	@PostMapping(value = "/courseInsertion")
	public ResponseEntity<String> courseInsertion(@RequestBody Course course) {
		String courses = courseService.registerUser(course);
		return new ResponseEntity<String>(courses, HttpStatus.CREATED);
	}

	@GetMapping(value = "/allCourses")
	public ResponseEntity<List<Course>> getAllUsers() throws CoursesNotFoundException {
		List<Course> courseList = courseService.dispalyAllCourses();
		if (courseList.isEmpty()) {
			return new ResponseEntity<List<Course>>(courseList, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Course>>(courseList, HttpStatus.OK);

	}

	@GetMapping("/searchCourse")
	public ResponseEntity<Course> filterCourse(Integer courseId) throws CourseIdNotFoundException {
		Course course = courseService.searchCourse(courseId);
		if (courseId == null) {
			return new ResponseEntity<Course>(course, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}

	@PostMapping(value = "/courseFilter")
	public ResponseEntity<List<Course>> courseFilter(String courseName) throws CoursesNotFoundException {
		List<Course> courses = courseService.getFilterCourses(courseName);
		return new ResponseEntity<List<Course>>(courses, HttpStatus.OK);
	}

}
