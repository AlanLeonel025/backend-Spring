package com.example.rest_spring.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.rest_spring.entity.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users,Long>{
	@Query(value = "SELECT u FROM Users u where u.id = :id")
	public List<Users> findUsersById(Long id);
}
