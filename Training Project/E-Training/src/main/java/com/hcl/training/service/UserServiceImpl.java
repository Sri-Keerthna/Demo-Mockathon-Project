package com.hcl.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.training.dto.UserDto;
import com.hcl.training.exception.UserValidationException;
import com.hcl.training.model.Enrollment;
import com.hcl.training.model.User;
import com.hcl.training.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	EnrollmentServiceImpl enrollmentService;
	

	@Override
	public Enrollment loginAuthenticate(User user) throws UserValidationException {
		String name = user.getUserName();
		String secrerCode = user.getPassWord();
		User user1 = userRepository.findUserByuserName(name);
		if (user1.getUserName().equals(name) && user1.getPassWord().equals(secrerCode)) {
			Integer userId = user1.getUserId();
			return enrollmentService.findEnrollmentByuserId(userId);
		} else {
			 throw new UserValidationException("Invalid Credentials");
		}
	}

	public String createLogin(UserDto userDto) {
		User user=new User();
		user.setUserName(userDto.getUserName());
		user.setPassWord(userDto.getPassWord());
		userRepository.save(user);
		return "Login Created";

	}
}
