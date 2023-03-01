package com.simplilearn.service;

import com.simplilearn.model.Admin;
import com.simplilearn.model.Medicine;

public interface Adminservice {

	public void addMedicine(Medicine medicine);
	public void deleteMedicine(int id);
	public void editMedicine(Medicine medicine);
	public void enableDisable(int available);
	public boolean validateAdmin(Admin admin);
}
