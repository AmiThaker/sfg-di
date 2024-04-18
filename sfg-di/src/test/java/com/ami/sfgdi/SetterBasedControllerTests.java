package com.ami.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ami.sfgdi.controllers.SetterBasedController;
import com.ami.sfgdi.services.ConstructorGreetingService;

@SpringBootTest
public class SetterBasedControllerTests {
	
	SetterBasedController controller;
	
	@BeforeEach
	void setUp() {
		
		controller = new SetterBasedController();
		controller.setGreetingService(new ConstructorGreetingService());
		
	}
	
	@Test
	public void getGreeting() {
		
		
		System.out.println(controller.getGreeting());
	}

}
