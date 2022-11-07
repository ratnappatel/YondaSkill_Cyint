package com.yskill.requests;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


public class LaptopRequest {
	
	private String name;
	
	private String brand;
	
	private BigDecimal price;
	
	private List<String> colors;
	public LaptopRequest() {
	}
	public LaptopRequest(String name, String brand, BigDecimal price, List<String> colors) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.colors = colors;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public List<String> getColors() {
		return colors;
	}
	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	@Override
	public String toString() {
		return "LaptopRequest [name=" + name + ", brand=" + brand + ", price=" + price + ", colors=" + colors + "]";
	}
	
	
	
}