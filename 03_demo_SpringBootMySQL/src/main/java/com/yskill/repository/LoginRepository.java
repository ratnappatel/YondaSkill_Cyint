package com.yskill.repository;

import org.springframework.data.repository.CrudRepository;

import com.yskill.dto.LoginDTO;
import com.yskill.entity.Customer;

public interface LoginRepository extends CrudRepository<Customer,String>{
	
}
