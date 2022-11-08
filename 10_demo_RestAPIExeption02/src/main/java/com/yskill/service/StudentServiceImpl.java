package com.yskill.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yskill.dto.StudentDTO;
import com.yskill.entity.Student;
import com.yskill.exception.StudentException;
import com.yskill.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired 
	private StudentRepository repository;
	
	@Override
	public StudentDTO addStudentDetails(StudentDTO s) {
		Student s1=this.getStudentEntity(s);
		s1=repository.save(s1);
		return this.getStudentDTO(s1);
	}
	
	private Student getStudentEntity(StudentDTO s)
	{
		Student s1=new Student();
		s1.setRollno(s.getRollno());
		s1.setName(s.getName());
		s1.setStream(s.getStream());
		return s1;
	}
	
	private StudentDTO getStudentDTO(Student s)
	{
		StudentDTO s1=new StudentDTO();
		s1.setRollno(s.getRollno());
		s1.setName(s.getName());
		s1.setStream(s.getStream());
		return s1;
	}

	@Override
	public List<StudentDTO> getAllStudent() {
		List<Student> students=(List<Student>) repository.findAll();
		List<StudentDTO> studentDTOs=new ArrayList<StudentDTO>();
		
		students.forEach((student)->{
			StudentDTO s=this.getStudentDTO(student);
			studentDTOs.add(s);
		});
		
		return studentDTOs;
	}

	@Override
	public StudentDTO getStudentDetails(int rollno)throws StudentException {
		StudentDTO s1=new StudentDTO();
		Optional<Student> optionalStudent=repository.findById(rollno);
		if(optionalStudent.isPresent())
		{
			Student s=optionalStudent.get();
			s1=this.getStudentDTO(s);
		}
		else
		{
			System.out.println("Enter Rollno does not exists");
			throw new StudentException("Student with Rollno : "+rollno+" does not exists");
		}
		return s1;
	}

	@Override
	public StudentDTO updateStudentDetails(int rollno, StudentDTO s) {
		Student st=repository.findById(rollno).get();
		st.setName(s.getName());
		st.setStream(s.getStream());
		repository.save(st);
		return this.getStudentDTO(st);
	}

	@Override
	public String deleteStudent(int rollno) throws StudentException{
		Optional<Student> optionalStudent=repository.findById(rollno);
		Student st=optionalStudent.orElseThrow(()->new StudentException("Student with given Rollno does not exists"));
		repository.delete(st);
		return "success";
	}

	@Override
	public StudentDTO findStudentByName(String name)throws StudentException {
		
		Student s=repository.findByName(name);
		if(s==null)
				throw new StudentException("Student with name "+name+" does not exists.");
		return this.getStudentDTO(s);
	}
}
