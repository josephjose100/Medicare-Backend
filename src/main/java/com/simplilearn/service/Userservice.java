package com.simplilearn.service;

import com.simplilearn.model.Users;

public interface Userservice {
	
	public void registerUser(Users user);
	public boolean validateUser(Users user);
	
	

}
