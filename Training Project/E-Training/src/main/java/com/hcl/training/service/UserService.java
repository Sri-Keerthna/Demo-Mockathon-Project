package com.hcl.training.service;

import com.hcl.training.dto.UserDto;
import com.hcl.training.exception.UserValidationException;
import com.hcl.training.model.Enrollment;
import com.hcl.training.model.User;

public interface UserService {

	Enrollment loginAuthenticate(User user) throws UserValidationException;

	String createLogin(UserDto userDto);
}
