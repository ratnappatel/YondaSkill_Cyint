package com.yskill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yskill.dto.LoginDTO;
import com.yskill.exception.LoginException;
import com.yskill.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;
		
	@Override
	public String authenticateCustomer(LoginDTO input) throws LoginException {
		//loginRepository =new LoginRepositoryImpl();
		String toReturn="";
		LoginDTO actual=loginRepository.authenticateCustomer(input.getUserId());
		if(input.getPassword().equals(actual.getPassword()))
			toReturn="Success";
		else
			throw new LoginException("Failure");
			
		
		return toReturn;
	}

}
