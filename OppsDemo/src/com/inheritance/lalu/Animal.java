package com.inheritance.lalu;

public class Animal extends LivingBeeing {
	
	String type;
	
	Animal(){
		
		System.out.println("Animal Object is created ");
		
	}
	
	void getTypeOfAnimanl(String type) {
		
		this.type=type;
	}

}
