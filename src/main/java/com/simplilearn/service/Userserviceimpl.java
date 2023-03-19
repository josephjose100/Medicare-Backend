package com.simplilearn.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.dto.RegisterUserDto;
import com.simplilearn.model.Address;
import com.simplilearn.model.Users;
import com.simplilearn.repository.Addressrepository;
import com.simplilearn.repository.Userrepository;

@Service
public class Userserviceimpl implements Userservice{

	@Autowired
	EntityManager entitymanager;
	
	@Autowired
	Userrepository userrepository;
	
	@Autowired
	Addressrepository addressrepository;
	
	@Override
	public void registerUser(Users user) {
	
		Address address=user.getAddress();
		addressrepository.save(address); 
		userrepository.save(user);
		
	}

	
	public List<Users> getallUsers() {
		
	
		return userrepository.findAll();
	
		
	
	}

	


}
