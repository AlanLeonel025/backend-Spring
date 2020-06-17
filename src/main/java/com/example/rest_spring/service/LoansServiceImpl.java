package com.example.rest_spring.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.rest_spring.entity.Loans;
import com.example.rest_spring.entity.Users;
import com.example.rest_spring.repository.LoansRepository;
import com.example.rest_spring.repository.UsersRepository;
@Service
public class LoansServiceImpl implements ILoansService {

	@Autowired
	LoansRepository repository;
	EntityManager em;
	@Transactional
	@Override
	public List<Loans> findAll() {
		// TODO Auto-generated method stub
		return (List<Loans>) repository.findAll();
	}
	@Transactional
	@Override
	public void save(Loans loan) {
		// TODO Auto-generated method stub
		repository.save(loan);
	}
	@Transactional
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
	@Transactional
	@Override
	public Loans findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public List<Loans> findAllById(Long idUser,int limit,int offset) {
		// TODO Auto-generated method stub
		return repository.findLoansById(idUser, limit, offset);
	}
}
