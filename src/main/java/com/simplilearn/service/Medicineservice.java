package com.simplilearn.service;

import java.util.List;

import com.simplilearn.model.Medicine;

public interface Medicineservice {

	public List<Medicine> getMedicine();
	public void addMedicine(Medicine medicine);
	public void deleteMedicine(int id);
	public void updateMedicine(Medicine medicine);
	public void enableDisableMedicine(int id,int availability);
	public Medicine getJson(String medicine);
	
}
