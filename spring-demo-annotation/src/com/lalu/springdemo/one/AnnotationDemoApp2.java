package com.lalu.springdemo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp2 {

	public static void main(String[] args) {
		
		
		//read spring config file
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		
		//call a method on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		
		context.close();

	}

}
