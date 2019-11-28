package com.hcl.training.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.training.dto.UserDto;
import com.hcl.training.model.Enrollment;
import com.hcl.training.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	User findUserByuserName(String name);

	Enrollment findEnrollmentByuserId(Integer userId);

	User findUserByuserId(Integer userId);


}
