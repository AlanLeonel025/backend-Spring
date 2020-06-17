package com.example.rest_spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.rest_spring.entity.Loans;
import com.example.rest_spring.entity.Users;

public interface LoansRepository  extends CrudRepository<Loans,Long>{
	@Query(value = "SELECT l.* FROM loans l INNER JOIN users u ON l.user_id=u.id where u.id= :idUser limit :limit OFFSET :offset", nativeQuery = true)
	public List<Loans> findLoansById(Long idUser,int limit,int offset);
}
