package com.swapping;

public class Swapping {
	
	private int a;
	private int b;
	
	public Swapping(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
	@Override
	public String toString() {
		return "Swapping [a=" + a + ", b=" + b + "]";
	}
	
	public int swap() {
		
		a=a+b;
		b=a-b;
		a=a-b;	
		return a;
	}
	
	public int swaping() {
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		
		return b;
		
	}
	

}
