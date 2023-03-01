package com.simplilearn.service;

import com.simplilearn.model.User;

public interface Userservice {
	
	public void registerUser(User user);
	public boolean validateUser(User user);
	
	

}
