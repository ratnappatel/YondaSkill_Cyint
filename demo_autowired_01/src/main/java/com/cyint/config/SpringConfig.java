package com.cyint.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//instruct IOC-Container where to look for beans to be instantiated..
@ComponentScan(basePackages="com.cyint.service com.cyint.repository com.cyint.controller")
public class SpringConfig {

	// Manual creation of Objects..
}
