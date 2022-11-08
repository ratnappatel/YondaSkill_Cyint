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
	
		if(optionalEmp.isEmpty())
			System.out.println("Employee does not exists");
		return optionalEmp.orElseThrow(()->new EmployeeException("EMPLOYEE_NOT_FOUND"));
	}
	@Override
	public int addEmployee(Employee e) {
		e=repository.save(e);
		return e.getId();
	}
	@Override
	public Employee updateEmployeeDetails(int id, Employee newEmp) throws EmployeeException{
		Optional<Employee> optionalEmp=repository.findById(id);
		Employee oldEmp=optionalEmp.orElseThrow(()->new EmployeeException("EMPLOYEE_NOT_FOUND"));
		oldEmp.setName(newEmp.getName());
		oldEmp.setSalary(newEmp.getSalary());
		oldEmp.setDept(newEmp.getDept());
		oldEmp=repository.save(oldEmp);
		return oldEmp;
	}
	@Override
	public String deleteEmployee(int id) throws EmployeeException {
		Optional<Employee> optionalEmp=repository.findById(id);
		Employee emp=optionalEmp.orElseThrow(()->new EmployeeException("EMPLOYEE_NOT_FOUND"));
		repository.delete(emp);
		return "Employee Details removed Successfully.";
	}
	@Override
	public List<Employee> searchByName(String name) throws EmployeeException {
		
		return repository.findByName(name);
	}

}
