package com.lalu.springdemo.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
public TennisCoach() {
		
		System.out.println("inside the defalut constructor");
	}

	//define a setter method
	
	
	
/*	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside the setter method");
		this.fortuneService = fortuneService;
	}*/

	
	
	//define the default constructor 
	/*@Autowired
	public TennisCoach(FortuneService theForyuneService) {
		
		fortuneService =theForyuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "practice your backhand volly";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() ;
	}

}
