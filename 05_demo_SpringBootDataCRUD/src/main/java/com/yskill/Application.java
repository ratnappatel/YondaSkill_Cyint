package com.yskill;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yskill.controller.StudentController;
import com.yskill.dto.StudentDTO;
import com.yskill.exception.StudentException;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Log LOGGER=LogFactory.getLog(Application.class);
	@Autowired
	private StudentController controller;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//this.add();
		this.getAllStudent();
		//System.out.println("====================================");
		//this.getStudentDetails();
		System.out.println("====================================");
	
		//StudentDTO s=controller.getStudentByName("Uttam");
		//LOGGER.info(s);
		this.update();
		try {
			controller.removeStudent(6);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		
	}
	
	public void add()
	{
		StudentDTO s=new StudentDTO();
		s.setName("Pinakin");
		s.setStream("Surgery");
		int rollno=controller.addNewStudent(s);
		LOGGER.info("New Student Details saved with Rollno : "+rollno);
		
	}

	public void getAllStudent()
	{
		List<StudentDTO> students=controller.getAllStudent();
		LOGGER.info(students);
	}
	
	public void getStudentDetails()
	{
		StudentDTO s=null;
		try {
			s = controller.getStudentDetails(31);
		} catch (StudentException e) {
			LOGGER.error(e.getMessage());
		}
		LOGGER.info(s);
	}
	
	public void update()
	{
		StudentDTO s=new StudentDTO(3, "Varniraj", "MicroBio");
		s=controller.updateStudentDetails(s.getRollno(), s);
		LOGGER.info("Student Details Updated Successfully.."+s);
	}
}
