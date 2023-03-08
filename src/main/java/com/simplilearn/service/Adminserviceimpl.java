package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.model.Admin;
import com.simplilearn.repository.Adminrepository;

@Service
public class Adminserviceimpl implements Adminservice{

	@Autowired
	Adminrepository adminrepository;

	
	public List<Admin> getAdmin() {
		
		return adminrepository.findAll();
	}
	
	
	
}
