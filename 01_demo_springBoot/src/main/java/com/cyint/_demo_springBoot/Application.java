package com.cyint._demo_springBoot;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Currently its a stand-alone application
@SpringBootApplication
public class Application implements CommandLineRunner {

	public static final Log LOGGER=LogFactory.getLog(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Run method invoked at : "+new Date());
		System.out.println("Welcome to CommandLineRunner.....");
		
	}

}
