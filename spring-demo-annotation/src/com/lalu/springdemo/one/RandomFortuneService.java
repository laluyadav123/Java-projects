package com.lalu.springdemo.one;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	//create an array of strings
	
	private String[] data= {"great things takes time",
			"not today then never tomorrow",
			"dont worry be happy"
			}; 
	
	//create a random number generator
	
	private Random myRandom =new Random();

	@Override
	public String getFortune() {
		
		int index =myRandom.nextInt(data.length);
		
		String theFortune =data[index];
	
		return theFortune;
	
	}

}
