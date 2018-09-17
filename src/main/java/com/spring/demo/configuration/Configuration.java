package com.spring.demo.configuration;

import org.springframework.context.annotation.Bean;

import com.spring.demo.Service.impl.WelcomeServiceImpl;
import com.spring.demo.Service.impl.WelcomeServiceTwo;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Bean
	public WelcomeServiceTwo welcomeServiceTwo() {
		return new WelcomeServiceTwo();
	}

	@Bean
	public WelcomeServiceImpl welcomeServiceImpl() {
		return new WelcomeServiceImpl();
	}

}
