package com.simplilearn.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.model.Users;
import com.simplilearn.repository.Userrepository;

@Service
public class Userserviceimpl implements Userservice{

	@Autowired
	EntityManager entitymanager;
	
	@Autowired
	Userrepository userrepository;
	
	@Override
	public void registerUser(Users user) {
		
		userrepository.save(user);
		
	}

	

	@Override
	public boolean validateUser(Users user) {
		List<Users> users=userrepository.findAll();
		for(Users user1:users)
		{
			if((user1.getName().equals(user.getName()))&&(user1.getPassword().equals(user.getPassword())))
			{
				return true;
			}
		}
		return false;
	}

}
