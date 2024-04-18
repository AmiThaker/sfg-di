package com.ami.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ami.sfgdi.controllers.ConstructorBasedController;
import com.ami.sfgdi.services.ConstructorGreetingService;

@SpringBootTest
public class ConstructorBasedControllerTests {
	
	ConstructorBasedController controller;
	
	@BeforeEach
	void setUp() {
		controller=new ConstructorBasedController(new ConstructorGreetingService());
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
