package com.hcl.training.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.training.model.Enrollment;

@Repository
public interface EnrollmentRepository extends CrudRepository<Enrollment, Integer> {

	Enrollment findEnrollmentByuserId(Integer userId);

	List<Enrollment> findByUserIdAndCourseName(Integer userId, String courseName);



}
