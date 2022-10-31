package com.cyint.dto;

public class LoginDTO {
	
	private String loginId;
	private String password;
	public LoginDTO() {
		// TODO Auto-generated constructor stub
	}
	public LoginDTO(String loginId, String password) {
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
		return "LoginDTO [loginId=" + loginId + ", password=" + password + "]";
	}
	

}
