package com.example.rest_spring.service;

import java.util.List;

import com.example.rest_spring.entity.Users;

public interface IUsersService {
	
	List<Users> findAll();

	void save(Users user);

	void delete(Long id);

	Users findOne(Long id);
	
	List<Users> findAllById(Long id);
}
