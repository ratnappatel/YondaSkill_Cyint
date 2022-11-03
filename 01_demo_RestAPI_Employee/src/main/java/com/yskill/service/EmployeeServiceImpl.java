package com.yskill.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yskill.entity.Employee;
import com.yskill.exception.EmployeeException;
import com.yskill.repository.EmployeeRepository;

@Service

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	@Override
	public List<Employee> getAllEmployee() {
		Iterable<Employee> itr=repository.findAll();
		return (List<Employee>)itr;
	}
	@Override
	public Employee getEmployee(int id) throws EmployeeException{
		Optional<Employee> optionalEmp=repository.findById(id);
		/*
		 * if(optionalEmp.isPresent()) return optionalEmp.get(); else throw new
		 * EmployeeException("");
		 */
		return optionalEmp.orElseThrow(()->new EmployeeException("Employee with id "+id+" does not exists.."));
	}

}
