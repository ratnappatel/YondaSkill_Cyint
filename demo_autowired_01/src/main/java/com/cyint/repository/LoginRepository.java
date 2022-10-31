package com.cyint.repository;

import com.cyint.dto.LoginDTO;

public interface LoginRepository {
	public LoginDTO authenticateCustomer(String loginId);

}
