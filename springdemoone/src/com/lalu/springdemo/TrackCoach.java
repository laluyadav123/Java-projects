package com.lalu.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getdailyworkout() {

		return "run a hard 5k";
	}

	@Override
	public String getdailyfortune() {

		return "have a Great day! ";
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
