package com.yskill.service;


import com.yskill.dto.LoginDTO;
import com.yskill.exception.LoginException;

public interface LoginService {
	public String authenticateCustomer(LoginDTO loginDto)throws LoginException;

}
