package com.yskill;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.yskill.entity.Employee;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//this.getEmployee();
		//this.addEmployee();
		//this.getEmployees();
		//this.updateEmployeeDetails();
		this.deleteEmployee();
		this.getEmployees();
		
	}
	
	public void getEmployees()
	{
		RestTemplate template=new RestTemplate();
		String _apiURL="http://localhost:8765/EmployeeAPI/emps";
		ResponseEntity<ArrayList> objs=template.getForEntity(_apiURL, ArrayList.class );
		ArrayList<Employee> emps= objs.getBody();
		System.out.println(emps);
	}
	public Employee getEmployee(int id)
	{
		RestTemplate template=new RestTemplate();
		String _apiURL="http://localhost:8765/EmployeeAPI/emps/{id}";
		Employee e=template.getForObject(_apiURL, Employee.class,id);
		System.out.println(e);
		return e;
	}
	public void addEmployee()
	{
		RestTemplate template=new RestTemplate();
		String _apiURL="http://localhost:8765/EmployeeAPI/emps";
		
		Employee e1=new Employee();
		e1.setName("Tapu");
		e1.setDept(50);
		e1.setSalary(88000);
		
		String msg=template.postForObject(_apiURL, e1, String.class);
		System.out.println(msg);
	}
	public void deleteEmployee()
	{
		RestTemplate template=new RestTemplate();
		String _apiURL="http://localhost:8765/EmployeeAPI/emps/{id}";
		template.delete(_apiURL, 1002); // Auto-boxing is taking place 1002==> Integer-Obj
		System.out.println("Employee Details removed successfully....");
	}
	public void updateEmployeeDetails()
	{
		RestTemplate template=new RestTemplate();
		String _apiURL="http://localhost:8765/EmployeeAPI/emps/{id}";
		Employee e=this.getEmployee(1001);
		e.setDept(80);
		e.setSalary(998000);		
		template.put(_apiURL, e, e.getId());
		System.out.println("Employee Details Updated Successfully....");
		this.getEmployee(1001);
	}
	

}
