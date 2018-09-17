package com.spring.demo.Service.impl;

import com.spring.demo.Service.WelcomeService;

public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String getWelcome() {
		return "home";
	}

}
