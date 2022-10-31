package com.yskill.repository;

import java.util.HashMap;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yskill.dto.LoginDTO;

@Repository
public class LoginRepositoryImpl implements LoginRepository {

	LoginDTO loginDto=new LoginDTO();
	@Override
	public LoginDTO authenticateCustomer(String userid) {
		
		Map<String,String> customers=new HashMap<String,String>();
		customers.put("ratna","ratna@123");
		customers.put("uttam","uttam123");
		customers.put("neel","neel@123");
		customers.put("pinakin","pinakin@123");
		
		loginDto.setUserId(userid);
		loginDto.setPassword(customers.get(userid.toLowerCase()));
		return loginDto;
	}
}
