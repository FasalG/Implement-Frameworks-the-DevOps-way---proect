package com.sportyshoe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MyShoes")
public class myShoesList {
	
	@Id
	private int id;
	private String name;
	private String manufacturer;
	private String price;
	public myShoesList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public myShoesList(int id, String name, String manufacturer, String price) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
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
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}