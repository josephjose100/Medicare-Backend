package com.simplilearn.dto;

public class RegisterUserDto {

	
	private String name;
	private String password;
	private String houseNo;
	private String locality;
	private String district;
	private String state;
	public RegisterUserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterUserDto(String name, String password, String houseNo, String locality, String district,
			String state) {
		super();
		this.name = name;
		this.password = password;
		this.houseNo = houseNo;
		this.locality = locality;
		this.district = district;
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
}
