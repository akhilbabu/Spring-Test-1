package com.spring.demo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.demo.Service.WelcomeService;
import com.spring.demo.model.UserModel;

@Controller
public class WelcomeController {

	/* @Autowired */
	private WelcomeService service;

	public WelcomeController(@Qualifier("welcomeServiceImpl") WelcomeService service) {
		this.service = service;
	}

	@GetMapping(value = "/")
	public String welcomeControll(Model model) {
		model.addAttribute("value", new UserModel());
		return "login";
	}

	@PostMapping(value = "/check")
	public String welcomeControll(@ModelAttribute("value") UserModel command, Model model) {
		System.out.println(command.getUserName() + ">>>>>>>>>" + command.getPasswrd());
		model.addAttribute("value", command);
		return service.getWelcome();
	}

}
