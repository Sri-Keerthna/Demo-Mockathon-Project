package com.hcl.training.service;

import java.util.List;

import com.hcl.training.exception.CourseIdNotFoundException;
import com.hcl.training.exception.CoursesNotFoundException;
import com.hcl.training.model.Course;

public interface CourseService {

	String registerUser(Course course);

	List<Course> dispalyAllCourses() throws CoursesNotFoundException;

	Course searchCourse(Integer courseId) throws CourseIdNotFoundException;

	List<Course> getFilterCourses(String courseName) throws CoursesNotFoundException;
}
