package com.lalu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLyfeCycleDemoApp {
	
	public static void main(String[] args) {
		 
	 
	
	//load the spring configuration file
	
	ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//retrieve bean from spring container
	
	Coach theCoach = Context.getBean("myCoach" , Coach.class);
	
	System.out.println(theCoach.getdailyworkout());
	
	
	
	//close the context
     
     Context.close();

}
}

