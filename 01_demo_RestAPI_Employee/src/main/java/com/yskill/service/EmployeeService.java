package com.yskill.service;

import java.util.List;

import com.yskill.entity.Employee;
import com.yskill.exception.EmployeeException;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee();
	public Employee getEmployee(int id) throws EmployeeException;

}
