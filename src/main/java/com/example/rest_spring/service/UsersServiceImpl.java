package com.example.rest_spring.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.rest_spring.entity.Users;
import com.example.rest_spring.repository.UsersRepository;
@Service
public class UsersServiceImpl implements IUsersService {
	@Autowired
	UsersRepository repository;
	EntityManager em;
	@Transactional
	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return (List<Users>) repository.findAll();
	}
	@Transactional
	@Override
	public void save(Users user) {
		// TODO Auto-generated method stub
		repository.save(user);
	}
	@Transactional
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
	@Transactional
	@Override
	public Users findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Users> findAllById(Long id) {
		// TODO Auto-generated method stub
		return repository.findUsersById(id);
	}


}
