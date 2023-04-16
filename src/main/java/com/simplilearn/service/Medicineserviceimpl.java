package com.simplilearn.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.simplilearn.exception.ResourceNotFoundException;
import com.simplilearn.model.Medicine;
import com.simplilearn.repository.Medicinerepository;

@Service
public class Medicineserviceimpl implements Medicineservice {

	@Autowired
	Medicinerepository medicinerepository;
	
	@Override
	public List<Medicine> getMedicine() {
		
		return medicinerepository.findAll();
		
	}

	@Override
	public void addMedicine(Medicine medicine) {
		medicine.setAvailable(true);
		medicinerepository.save(medicine);
		
		
	}

	@Override
	public void deleteMedicine(int id) {
		
	Medicine medicine=medicinerepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		medicinerepository.delete(medicine);
	}

	@Override
	public void updateMedicine(Medicine medicine) {
		
		medicinerepository.save(medicine);
		
	}

	@Override
	public Medicine getJson(String medicine) {
		Medicine medicineJson=new Medicine();
		try {
			ObjectMapper objectmapper=new ObjectMapper();
			medicineJson=objectmapper.readValue(medicine, Medicine.class); 
		}
		catch(IOException err)
		{
			err.printStackTrace();
		}
		return medicineJson;
	}

	@Override
	public void enableDisableMedicine(int id,boolean availability) {
		Medicine medicine=medicinerepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		medicine.setAvailable(availability);
		medicinerepository.save(medicine);
		
	}

	
}
