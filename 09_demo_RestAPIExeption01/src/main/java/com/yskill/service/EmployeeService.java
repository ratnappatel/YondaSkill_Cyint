package com.yskill.service;

import java.util.List;

import com.yskill.entity.Employee;
import com.yskill.exception.EmployeeException;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee();
	public Employee getEmployee(int id) throws EmployeeException;
	public int addEmployee(Employee e);
	public Employee updateEmployeeDetails(int id,Employee e)throws EmployeeException;
	public String deleteEmployee(int id)throws EmployeeException;
	public List<Employee> searchByName(String name)throws EmployeeException;

}
