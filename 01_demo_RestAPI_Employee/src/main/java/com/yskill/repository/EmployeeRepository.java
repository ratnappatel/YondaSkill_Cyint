package com.yskill.repository;

import org.springframework.data.repository.CrudRepository;

import com.yskill.entity.Employee;

public interface EmployeeRepository  extends CrudRepository<Employee , Integer>{

}
