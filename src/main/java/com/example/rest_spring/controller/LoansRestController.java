package com.example.rest_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest_spring.entity.Loans;
import com.example.rest_spring.service.ILoansService;

@RestController
public class LoansRestController {
	@Autowired
	ILoansService loansService;
    @GetMapping("/getloans")
	public List<Loans> listar(@RequestParam Long id,@RequestParam int limit,@RequestParam int offset) {
		return loansService.findAllById(id, limit, offset);
	}
}
