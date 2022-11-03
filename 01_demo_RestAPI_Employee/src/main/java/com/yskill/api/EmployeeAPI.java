package com.yskill.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@PostMapping("/emps")
	public String addEmployee(@RequestBody() Employee e)
	{
		int id=service.addEmployee(e);
		return "Employee details added with an id : "+id;
	}
	
	@PutMapping("/emps/{id}")
	public Employee updateEmployee(@PathVariable("id")Integer id,@RequestBody Employee e)throws EmployeeException
	{
		return service.updateEmployeeDetails(id, e);		
	}
	
	@DeleteMapping("/emps/{id}")
	public String removeEmployee(@PathVariable("id")Integer id)throws EmployeeException
	{
		return service.deleteEmployee(id);
	}
}
