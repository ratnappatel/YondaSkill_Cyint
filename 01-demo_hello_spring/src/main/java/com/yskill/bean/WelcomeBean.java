package com.yskill.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // is a java class contains data logic
public class WelcomeBean {
	
	@Autowired // to IOC - before calling any function create an object of dependent bean
	MessageBean messageBean;
	
	public String printWelcome()
	{
		System.out.println(messageBean.greet());
		return "Welcome to Spring World.."; 
	}

}
