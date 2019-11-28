package com.hcl.training.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.training.dto.UserDto;
import com.hcl.training.model.Enrollment;
import com.hcl.training.model.User;
import com.hcl.training.service.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
	
	@InjectMocks
	UserController userController;
	
	@Mock
	UserServiceImpl userServiceImpl;
	UserDto userdto=null;
	User user=null;
	Enrollment enroll=null;
	
	@Before
	public void before() {
		UserDto userDto=new UserDto();
		User user=new User();
		userDto.setUserName("Sugan");
		userDto.setPassWord("suganya");
		user.setUserName("Sugan");
		user.setPassWord("suganya");
		
		enroll=new Enrollment();
		enroll.setCourseName("MY SQL");
		enroll.setUserId(7);
		enroll.setEnrollId(1234);
		enroll.setAuthorName("Luker");
		enroll.setCourseDuration(8);
		enroll.setEnrollDate();
		
	}
	@Test
	

}
