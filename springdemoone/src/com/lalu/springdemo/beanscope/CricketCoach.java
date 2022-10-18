package com.lalu.springdemo.beanscope;

import com.lalu.springdemo.Coach;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//create new field for email and team
	private String EmailAddress;
	private String Team;
	
	
	// no arg constructor
	
	public CricketCoach() {
		System.out.println("CricketCoach : inside no-arg constructor");
	}
	
	//setter method

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside the setter method");
		this.fortuneService = fortuneService;
	}


	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside the setter method-setEmailAddress");
		EmailAddress = emailAddress;
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside the setter method-setTeam");
		Team = team;
	}

	@Override
	public String getdailyworkout() {
		
		return "practice every day for 5 hours";
	}

	@Override
	public String getdailyfortune() {
		return  fortuneService.getFortune() ;
	}

}
 