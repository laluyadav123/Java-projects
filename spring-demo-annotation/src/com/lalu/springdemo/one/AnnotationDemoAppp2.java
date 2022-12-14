package com.lalu.springdemo.one;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoAppp2 {

	public static void main(String[] args) {
		
		
		//read spring config java class
		AnnotationConfigApplicationContext context =new 	AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		
		//call a method on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		
		context.close();

	}

}
