package com.yskill.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yskill.bean.MessageBean;
import com.yskill.bean.WelcomeBean;
import com.yskill.config.SpringConfig;

public class UserInterface {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
		WelcomeBean b1=ctx.getBean(WelcomeBean.class);
		System.out.println(b1.printWelcome());
		
		/*
		 * MessageBean m1=ctx.getBean(MessageBean.class);
		 * System.out.println(m1.greet());
		 */
	}

}
