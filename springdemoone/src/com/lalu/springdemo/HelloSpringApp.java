 package com.lalu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		 
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container 
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getdailyworkout());
		
		//lets call our new method for fortune
		System.out.println(theCoach.getdailyfortune());
		
		//close the context
		context.close();

	}

}
 