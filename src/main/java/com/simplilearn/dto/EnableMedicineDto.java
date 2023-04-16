package com.simplilearn.dto;

public class EnableMedicineDto {

	int id;
	boolean availability;
	public EnableMedicineDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EnableMedicineDto(int id, boolean availability) {
		super();
		this.id = id;
		this.availability = availability;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean getAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	
}
