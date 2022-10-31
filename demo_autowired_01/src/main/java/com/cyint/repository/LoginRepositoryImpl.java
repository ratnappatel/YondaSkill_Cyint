package com.cyint.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cyint.dto.LoginDTO;

@Repository
public class LoginRepositoryImpl implements LoginRepository{

	private LoginDTO loginDto;
	public LoginDTO authenticateCustomer(String loginId) {
		loginDto=new LoginDTO();
		Map<String, String> customers=new HashMap<String,String>();
		
		customers.put("ratna","ratna@123");
		customers.put("uttam","uttam123");
		customers.put("neel","neel@123");
		customers.put("pinakin","pinakin@123");
		
		
		loginDto.setLoginId(loginId);
		loginDto.setPassword(customers.get(loginId.toLowerCase()));
		return loginDto;
	}

}
