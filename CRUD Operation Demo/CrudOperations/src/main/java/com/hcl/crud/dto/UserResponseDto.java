package com.hcl.crud.dto;

import java.util.List;

import com.hcl.crud.entity.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserResponseDto {

	private List<User> result;
	
	private Integer status;
	
	private String message;
}
