package com.cyint.ui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cyint.config.SpringConfig;
import com.cyint.controller.LoginController;
import com.cyint.dto.LoginDTO;

public class UserInterface {

	public static void main(String[] args) {
		LoginDTO loginDto=new LoginDTO();
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
		LoginController controller=ctx.getBean(LoginController.class);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Login ID : ");
		loginDto.setLoginId(sc.next());
		System.out.println("Enter Password : ");
		loginDto.setPassword(sc.next());
		String result=controller.authenticateCustomer(loginDto);
		if(result.equalsIgnoreCase("success"))
			System.out.println("Login Successful.......");
		else
			System.out.println("Login Denied TRY AGAIN LATER !........");
		
		
	}

}
