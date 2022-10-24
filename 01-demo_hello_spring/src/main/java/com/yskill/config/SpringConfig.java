package com.yskill.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yskill.bean.MessageBean;
import com.yskill.bean.WelcomeBean;

@Configuration
public class SpringConfig {
	
	@Bean
	public WelcomeBean welcomeBean()
	{
		return new WelcomeBean();
	}
	
	@Bean
	public MessageBean messageBean()
	{
		return new MessageBean();
	}

}
