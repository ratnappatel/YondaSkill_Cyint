package com.yskill.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.yskill.config.SpringConfig;

public class UserInterface {
	
	public static void main(String args[])
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
		Environment env=ctx.getEnvironment();
		
		String msg=env.getProperty("message");
		System.out.println(msg);
	}

}
