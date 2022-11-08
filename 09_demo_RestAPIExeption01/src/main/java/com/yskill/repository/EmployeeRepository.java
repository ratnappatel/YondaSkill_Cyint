package com.yskill.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.yskill.entity.Employee;

public interface EmployeeRepository  extends CrudRepository<Employee , Integer>{
	
	public List<Employee> findByName(String name);

}
