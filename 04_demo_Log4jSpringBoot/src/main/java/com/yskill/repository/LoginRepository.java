package com.yskill.repository;

import com.yskill.dto.LoginDTO;

public interface LoginRepository {
	public LoginDTO authenticateCustomer(String userid);
	// only 3 methods to be declared
}
