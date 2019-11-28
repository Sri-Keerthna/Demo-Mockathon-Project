package com.hcl.training.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hcl.training.model.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

	List<Course> findAll();

	Course findCourseBycourseName(String courseName);

	Course findCourseBycourseId(Integer courseId);


}
