package com.yskill.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.yskill.controller.LoginController;
import com.yskill.repository.LoginRepository;
import com.yskill.repository.LoginRepositoryImpl;
import com.yskill.service.LoginService;
import com.yskill.service.LoginServiceImpl;

@Configuration
@ComponentScan(basePackages="com.yskill.service com.yskill.repository")
@PropertySource("classpath:messages.properties")
public class SpringConfig {
	@Bean
	public LoginRepository loginRepository() {
		return new LoginRepositoryImpl();
	}
	
	@Bean
	public LoginService loginService()
	{
		return new LoginServiceImpl();
	}
	
	@Bean
	public LoginController loginController()
	{
		return new LoginController();
	}
}
