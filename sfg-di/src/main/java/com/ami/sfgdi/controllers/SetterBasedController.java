package com.ami.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ami.sfgdi.services.GreetingService;

@Controller
public class SetterBasedController {
	
	@Qualifier("setterInjectedGreetingService")
	@Autowired
	private GreetingService greetingService;
	
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService=greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
