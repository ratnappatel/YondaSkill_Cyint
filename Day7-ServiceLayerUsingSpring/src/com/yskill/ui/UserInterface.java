package com.yskill.ui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.yskill.config.SpringConfig;
import com.yskill.controller.LoginController;
import com.yskill.dto.LoginDTO;
import com.yskill.exception.LoginException;

public class UserInterface {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
		LoginController Controller=ctx.getBean(LoginController.class);
		Environment env=ctx.getEnvironment();
		
		Scanner sc=new Scanner(System.in);
		// Take Credentials as Input
		
		System.out.println("Enter User Id :");
		String userId=sc.next();
		System.out.println("Enter Password");
		String password=sc.next();
		
		// Create Data-Transfer Object
		LoginDTO loginDto=new LoginDTO();
		loginDto.setUserId(userId);
		loginDto.setPassword(password);
		
		try {
			String result=Controller.authenticateCustomer(loginDto);
			System.out.println(env.getProperty(result));
		} catch (LoginException e) {
			//System.out.println(e.getMessage());
			System.out.println(env.getProperty(e.getMessage()));
		}
	}

}
