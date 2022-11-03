package com.yskill.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yskill.entity.Employee;
import com.yskill.exception.EmployeeException;
import com.yskill.service.EmployeeService;

@RestController
@RequestMapping("/EmployeeAPI") //class-level mapping
public class EmployeeAPI {
	
	@Autowired
	private EmployeeService service;
	
	//service Endpoint
	@GetMapping("/emps")	
	public List<Employee> getAllEmployee()
	{
		return service.getAllEmployee();
	}
	
	@GetMapping("/emps/{id}")
	public Employee getEmployee(@PathVariable("id")Integer id)throws EmployeeException
	{
		return service.getEmployee(id);
	}

}
