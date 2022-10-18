package com.lalu.springdemo.one;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.lalu.springdemo.one")
public class SportConfig {
	
	
	//define bean for our sad fortune service
	 @Bean
	 public FortuneService SadFortuneService() {
		 return new SadFortuneService();
	 }
	
	
	//define bean for our swim coach and inject dependency
	
	 @Bean
	 public Coach swimCoach() {
		 return new SwimCoach(SadFortuneService());
	 }

}
