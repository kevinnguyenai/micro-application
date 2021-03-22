package com.app.microapplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private String id;
	private String name;

	
	public Product() {
		super();
	}

	public Product(String id, String name, String passportNumber) {
		super();
		this.id = id;
		this.name = name;

	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
}