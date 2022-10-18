package com.lalu.springdemo.one;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "tody is your lucky day";
	}

	
	

}
