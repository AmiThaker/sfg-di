package com.ami.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ami.sfgdi.controllers.PropertyInjectedController;
import com.ami.sfgdi.services.ConstructorGreetingService;

public class PropertyInjectedControllerTests {
	
	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller=new PropertyInjectedController();
		
		controller.greetingService=new ConstructorGreetingService();
	}
	
	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
	}

}
