package com.yskill.aggregation;

public class Student {
	
	private String stream;
	private Address address;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String stream, Address address) {
		super();
		this.stream = stream;
		this.address = address;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [stream=" + stream + ", address=" + address + "]";
	}

}
