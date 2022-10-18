package com.oppsdemo;

public class ClassB extends ClassA implements Bonus {

	public ClassB(int salary) {
		
		super(salary);
	}

	@Override
	public String toString() {
		return "ClassB [salary=" + salary + "]";
	}

	
	@Override
	public int getSalary() {
	 
		return super.getSalary();
	}
	 

}
