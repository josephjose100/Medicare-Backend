package com.simplilearn.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
	private int id;
	private String houseNo;
	private String locality;
	private String district;
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String houseNo, String locality, String district, String state) {
		super();
		this.id = id;
		this.houseNo = houseNo;
		this.locality = locality;
		this.district = district;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
