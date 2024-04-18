package com.ami.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("HIN")
@Service("i18nService")
public class I18nHindiService implements GreetingService{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Namaste - Hindi";
	}
	
	

}
