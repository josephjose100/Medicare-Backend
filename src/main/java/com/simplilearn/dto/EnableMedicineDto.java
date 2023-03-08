package com.simplilearn.dto;

public class EnableMedicineDto {

	int id;
	int availability;
	public EnableMedicineDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EnableMedicineDto(int id, int availability) {
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
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	
	
}
