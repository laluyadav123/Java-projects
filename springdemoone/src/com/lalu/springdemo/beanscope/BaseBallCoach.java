package com.lalu.springdemo.beanscope;

import com.lalu.springdemo.Coach;

public class BaseBallCoach implements Coach {
	
	

	
	//define a private field for dependency 
	private FortuneService fortuneservice;
	
	//define a constructor for dependency injection
	
	public BaseBallCoach(FortuneService theFortuneservice) {
		fortuneservice = theFortuneservice;
	}
	
	public BaseBallCoach() {
	}

	@Override
	public String getdailyworkout() {

		return "spend 30 minutes on batting practice";
	}

	@Override
	public String getdailyfortune() {
		
		return fortuneservice.getFortune();
	}
	// add an init methods

	public void myinitMethod() {
		System.out.println("inside myinitMethod");
	}

	// add a destroy method
	
	public void myDestroyMethod() {
		System.out.println("inside myDestroyMethod ");
		
	}
	

}
