package com.yskill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.yskill.controller.LoginController;
import com.yskill.dto.LoginDTO;
import com.yskill.exception.LoginException;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static final Log LOGGER=LogFactory.getLog(Application.class);
	
	@Autowired
	Environment env;
	
	@Autowired
	private LoginController controller;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			LoginDTO loginDto=new LoginDTO();
			loginDto.setUserId("ratna");
			loginDto.setPassword("ratna123");
			
			String result=controller.authenticateCustomer(loginDto);
			LOGGER.info(env.getProperty(result));
			
		} catch (LoginException e) {
			LOGGER.error(env.getProperty(e.getMessage()));
		}
		
	}

}
