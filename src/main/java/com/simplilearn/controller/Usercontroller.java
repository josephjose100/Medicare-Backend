package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.dto.RegisterUserDto;
import com.simplilearn.model.Users;
import com.simplilearn.service.Userservice;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Usercontroller {

	@Autowired
	Userservice userservice;
	
	@GetMapping("/users")
	public List<Users> getAllUsers()
	{
		return userservice.getallUsers();
	}
	
	@PostMapping("/users")
	public void registerUser(@RequestBody RegisterUserDto userdto)
	{
		userservice.registerUser(userdto);
	}
	
}
