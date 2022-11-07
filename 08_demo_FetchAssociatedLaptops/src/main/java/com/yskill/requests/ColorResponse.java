package com.yskill.requests;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;


public class ColorResponse {
	
	private Long id;
	
	private String laptop;
	
	private BigDecimal price;
	
	private String brand;
	
	private String color;
	public ColorResponse() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLaptop() {
		return laptop;
	}
	public void setLaptop(String laptop) {
		this.laptop = laptop;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}