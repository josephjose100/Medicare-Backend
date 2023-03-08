package com.simplilearn.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.dto.RegisterUserDto;
import com.simplilearn.model.Address;
import com.simplilearn.model.Users;
import com.simplilearn.repository.Userrepository;

@Service
public class Userserviceimpl implements Userservice{

	@Autowired
	EntityManager entitymanager;
	
	@Autowired
	Userrepository userrepository;
	
	@Override
	public void registerUser(RegisterUserDto userdto) {
		
		Users user=new Users();
		Address address=new Address();
		user.setName(userdto.getName());
		user.setPassword(userdto.getPassword());
	    address.setHouseNo(userdto.getHouseNo());
	    address.setLocality(userdto.getLocality());
	    address.setDistrict(userdto.getDistrict());
	    address.setState(userdto.getState());
	    user.setAddress(address);
		userrepository.save(user);
		
	}

	
	public List<Users> getallUsers() {
		
	
		return userrepository.findAll();
	
	}

	


}
