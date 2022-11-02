package com.yskill.service;

import java.util.List;

import com.yskill.dto.StudentDTO;
import com.yskill.exception.StudentException;


public interface StudentService {
	
	public StudentDTO addStudentDetails(StudentDTO s);
	public List<StudentDTO> getAllStudent();
	public StudentDTO getStudentDetails(int rollno) throws StudentException;
	public StudentDTO updateStudentDetails(int rollno,StudentDTO s);
	public String deleteStudent(int rollno) throws StudentException;
	public StudentDTO findStudentByName(String name);

}
