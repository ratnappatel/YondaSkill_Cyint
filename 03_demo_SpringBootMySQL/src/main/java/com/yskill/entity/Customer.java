package com.yskill.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // this class represent an actual table under database

public class Customer {
	
	@Id
	
	private String id;
	@Column(name="password")
	private String password;
	public Customer() {
	}
	public Customer(String loginId, String password) {
		super();
		this.id = loginId;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setLoginId(String loginId) {
		this.id = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [loginId=" + id + ", password=" + password + "]";
	}
	
	
	

}
