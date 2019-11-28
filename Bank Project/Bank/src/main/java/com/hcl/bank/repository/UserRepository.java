package com.hcl.bank.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.bank.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	List<User> findAll();

	User findUserByuserName(String name);
	
}
