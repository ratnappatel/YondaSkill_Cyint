package com.yskill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yskill.dto.StudentDTO;
import com.yskill.exception.StudentException;
import com.yskill.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	public int addNewStudent(StudentDTO s)
	{
		s=service.addStudentDetails(s);
		return s.getRollno();
	}
	
	public List<StudentDTO> getAllStudent()
	{
		return service.getAllStudent();
	}
	
	public StudentDTO getStudentDetails(int rollno) throws StudentException
	{
		return service.getStudentDetails(rollno);
	}

}
