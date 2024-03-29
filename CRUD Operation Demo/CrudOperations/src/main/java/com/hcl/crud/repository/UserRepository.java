package com.hcl.crud.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.crud.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	List<User> findAll();
	}
