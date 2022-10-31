package com.cyint.service;

import com.cyint.dto.LoginDTO;

public interface LoginService {
	
	public String authenticateCustomer(LoginDTO loginDto);

}
