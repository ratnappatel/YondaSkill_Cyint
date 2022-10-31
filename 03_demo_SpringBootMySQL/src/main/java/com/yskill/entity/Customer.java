package com.yskill.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // this class represent an actual table under database
@Table(name = "customers")
public class Customer {
	
	@Id
	@Column(name = "loginId")
	private String loginId;
	@Column(name="password")
	private String password;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String loginId, String password) {
		super();
		this.loginId = loginId;
		this.password = password;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [loginId=" + loginId + ", password=" + password + "]";
	}
	
	
	

}
