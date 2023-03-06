package com.simplilearn.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Medicine {

	@Id
	private int id;
	private String name;
	private String category;
	private float price;
	private String seller;
	private String description;
	private int available;
	private String url;
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medicine(int id, String name, String category, float price, String seller, String description, int available,
			String url) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.seller = seller;
		this.description = description;
		this.available = available;
		this.url = url;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
	
	
}
