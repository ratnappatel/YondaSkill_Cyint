package com.cyient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cyient.entity.Address;
import com.cyient.entity.Customer;
import com.cyient.service.CustomerService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CustomerService service;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.addCustomer();
		
	}
	
	public void addCustomer()
	{
		Address a1=new Address();
		a1.setHouse("2/5");
		a1.setStreet("Heerabagh");
		a1.setCity("Jaipur");
		
		Customer c=new Customer();
		c.setAddress(a1);
		c.setName("Ratna");
		c.setAge(42);
		c=service.addCustomer(c);
		System.out.println(c);
	}

}
