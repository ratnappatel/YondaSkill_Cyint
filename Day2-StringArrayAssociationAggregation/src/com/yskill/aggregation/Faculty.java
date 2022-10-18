package com.yskill.aggregation;

public class Faculty {
	
	private String name;
	private Address address;
	public Faculty() {
		// TODO Auto-generated constructor stub
	}
	public Faculty(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Faculty [name=" + name + ", address=" + address + "]";
	}
	

}
