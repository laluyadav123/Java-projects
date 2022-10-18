package com.lalu.springdemo.one;

public class SwimCoach implements Coach {
	

	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "swim 1000m as a worm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
