package com.yskill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yskill.dto.LoginDTO;
import com.yskill.exception.LoginException;
import com.yskill.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	
	public String authenticateCustomer(LoginDTO loginDto)throws LoginException
	{
		//loginService=new LoginServiceImpl();
		return loginService.authenticateCustomer(loginDto);
	}
}
