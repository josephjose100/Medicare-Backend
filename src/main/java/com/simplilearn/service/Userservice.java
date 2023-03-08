package com.simplilearn.service;

import java.util.List;

import com.simplilearn.dto.RegisterUserDto;
import com.simplilearn.model.Users;

public interface Userservice {
	
	public void registerUser(RegisterUserDto userdto);
	public List<Users> getallUsers();
	
	

}
