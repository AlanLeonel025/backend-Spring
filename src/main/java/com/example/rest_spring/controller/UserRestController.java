package com.example.rest_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest_spring.entity.Users;
import com.example.rest_spring.service.IUsersService;

@RestController
public class UserRestController {

	@Autowired
	IUsersService usersService;
    @GetMapping("/getusers/{id}")
	public List<Users> listar(@PathVariable Long id) {
		return usersService.findAllById(id);
	}
    
    @PostMapping(path="/postusers",consumes="application/json")
	public String guardar(@RequestBody Users user) {
    	usersService.save(user);
		return "Se agrego correctamente.";
	}
    @DeleteMapping("/deleteusers")
 	public String guardar(@RequestParam Long id) {
     	usersService.delete(id);
 		return "Eliminado";
 	}
    
}
