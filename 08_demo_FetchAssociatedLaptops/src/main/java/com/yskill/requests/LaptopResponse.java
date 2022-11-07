package com.yskill.requests;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


public class LaptopResponse {
	
	private Long id;
	
	private String laptop;
	
	private BigDecimal price;
	
	private String brand;
	
	private List<String> colors;

	public LaptopResponse(Long id, String laptop, BigDecimal price, String brand, List<String> colors) {
		super();
		this.id = id;
		this.laptop = laptop;
		this.price = price;
		this.brand = brand;
		this.colors = colors;
	}
	public LaptopResponse() {
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
	public List<String> getColors() {
		return colors;
	}
	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	
}