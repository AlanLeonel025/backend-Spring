package com.example.rest_spring.service;

import java.util.List;

import com.example.rest_spring.entity.Loans;

public interface ILoansService {
	
	List<Loans> findAll();

	void save(Loans loan);

	void delete(Long id);

	Loans findOne(Long id);
	
	List<Loans> findAllById(Long idUser,int limit,int offset);
	
}
