package com.oppsdemo;

public class ClassC implements Bonus {
	
	
	int salary;

	public ClassC(int salary) {
		
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ClassC [salary=" + salary + "]";
	}

	@Override
	public int getSalary() {
		this.salary=this.salary+bonus;
		

		return this.salary;
	}
	
	
	
 
}
