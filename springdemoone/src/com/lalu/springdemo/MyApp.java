package com.lalu.springdemo;

import com.lalu.springdemo.beanscope.BaseBallCoach;

public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new BaseBallCoach();
		
		System.out.println(theCoach.getdailyworkout()+ theCoach.getdailyfortune());

	}

}
