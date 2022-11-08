package com.yskill.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	@GetMapping("/emps")	
	public ResponseEntity<List<Employee>> getAllEmployee()
	{
		List<Employee> emps=(List<Employee>)service.getAllEmployee();
		return new ResponseEntity<>(emps,HttpStatus.OK);
	}
	
	@GetMapping("/emps/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id")Integer id)throws EmployeeException
	{
		Employee e= service.getEmployee(id);
		
		return new ResponseEntity<>(e,HttpStatus.OK);
	}

	@PostMapping("/emps")
	public ResponseEntity<String> addEmployee(@RequestBody() Employee e)
	{
		int id=service.addEmployee(e);
		return new ResponseEntity<>("Employee details added with an id : "+id,HttpStatus.OK);
	}
	
	@PutMapping("/emps/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id")Integer id,@RequestBody Employee emp)
			throws EmployeeException
	{
		Employee e = service.updateEmployeeDetails(id, emp);	
		return new ResponseEntity<>(e,HttpStatus.OK);		
	}
	
	@DeleteMapping("/emps/{id}")
	public ResponseEntity<String> removeEmployee(@PathVariable("id")Integer id) 
			throws EmployeeException
	{
		String msg = service.deleteEmployee(id);		
		return new ResponseEntity<>(msg,HttpStatus.OK);	
	}
	
	@GetMapping("/emps/name/{name}")
	public ResponseEntity<Object> findEmployeeByName(@PathVariable String name)
			throws EmployeeException
	{
		List<Employee> emps = service.searchByName(name);
		return new ResponseEntity<>(emps,HttpStatus.OK);
	}
}








