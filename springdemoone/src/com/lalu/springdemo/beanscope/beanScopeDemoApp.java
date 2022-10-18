package com.lalu.springdemo.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lalu.springdemo.Coach;

public class beanScopeDemoApp {
	
	public static void main(String[] args) {
		 
	 
	
	//load the spring configuration file
	
	ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
	
	//retrieve bean from spring container
	
	Coach theCoach = Context.getBean("myCoach" , Coach.class);
	
	  
     System.out.println(theCoach.getdailyfortune());
	
	//close the context
     
     Context.close();

}
}

