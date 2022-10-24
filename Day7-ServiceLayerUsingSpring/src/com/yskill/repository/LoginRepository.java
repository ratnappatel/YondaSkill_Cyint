package com.yskill.repository;

import com.yskill.dto.LoginDTO;

public interface LoginRepository {
	public LoginDTO authenticateCustomer(String userid);
}
