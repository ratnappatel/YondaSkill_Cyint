package com.cyint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cyint.dto.LoginDTO;
import com.cyint.service.LoginService;

// a CLASS WHICH IS MANAGING FLOW OF APPLICATION IS CALLED AS CONTROLLER HENCE 
@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	public String authenticateCustomer(LoginDTO loginDto)
	{
		return loginService.authenticateCustomer(loginDto);
	}

}
