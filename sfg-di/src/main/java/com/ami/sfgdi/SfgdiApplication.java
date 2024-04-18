package com.ami.sfgdi;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ami.sfgdi.controllers.ConstructorBasedController;
import com.ami.sfgdi.controllers.I18nController;
import com.ami.sfgdi.controllers.MyController;
import com.ami.sfgdi.controllers.PropertyInjectedController;
import com.ami.sfgdi.controllers.SetterBasedController;

@SpringBootApplication
public class SfgdiApplication {
	
	public static void main(String[] args) {
		org.springframework.context.ApplicationContext ctx= SpringApplication.run(SfgdiApplication.class, args);
		
		I18nController c=(I18nController)ctx.getBean("i18nController");
		System.out.println("I18NGreeting : "+c.sayHello());
		
		
		MyController myController=(MyController)ctx.getBean("myController");
		
		
		String greeting = myController.sayHello();
		
		System.out.println("Primary Greeting : "+greeting);
		
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		
		String propertyGreeting=propertyInjectedController.getGreeting();
		System.out.println("Property  Greeting : "+propertyGreeting);
		
		SetterBasedController sbController=(SetterBasedController) ctx.getBean("setterBasedController");
		String setterGreeting=sbController.getGreeting();
		System.out.println("Setter Greeting : "+setterGreeting);
		
		ConstructorBasedController cbController=(ConstructorBasedController) ctx.getBean("constructorBasedController");
		String constructorGreeting=cbController.getGreeting();
		System.out.println("Constructor Greeting : "+constructorGreeting);
		
	}

}
