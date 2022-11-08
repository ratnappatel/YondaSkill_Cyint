package com.yskill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.yskill.dto.StudentDTO;
import com.yskill.exception.StudentException;
import com.yskill.service.StudentService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:3000"})
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/students")
	public ResponseEntity<StudentDTO> addNewStudent(@RequestBody StudentDTO s)
	{
		s=service.addStudentDetails(s);
		return new ResponseEntity<>(s,HttpStatus.OK);
	}
	
	@GetMapping("/students")
	public List<StudentDTO> getAllStudent()
	{
		return service.getAllStudent();
	}
	
	@GetMapping("/students/{rollno}")
	public ResponseEntity<StudentDTO> getStudentDetails(@PathVariable Integer rollno)
	{
		StudentDTO s;
		try {
			s = service.getStudentDetails(rollno);
			return new ResponseEntity<>(s,HttpStatus.OK);
		} catch (StudentException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage(),e);
		}	
	}

	@GetMapping("/students/name/{name}")
	public ResponseEntity<StudentDTO> getStudentByName(@PathVariable String name)
	{
		StudentDTO s=null;
		try {
			s=service.findStudentByName(name);
		} catch (StudentException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage());
		}
		return new ResponseEntity<>(s,HttpStatus.OK);
		
	}
	
	public StudentDTO updateStudentDetails(int rollno, StudentDTO s)
	{
		return service.updateStudentDetails(rollno, s);
	}
	
	public String removeStudent(int rollno)throws StudentException
	{
		return service.deleteStudent(rollno);
	}
}
