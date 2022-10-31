package com.cyint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyint.dto.LoginDTO;
import com.cyint.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	public String authenticateCustomer(LoginDTO loginDto) {
		String toReturn="";
		LoginDTO actual=loginRepository.authenticateCustomer(loginDto.getLoginId());
		if(loginDto.getPassword().equals(actual.getPassword()))
			toReturn="Success";
		else
			toReturn="Failure";
		return toReturn;
	}
	
	

}
