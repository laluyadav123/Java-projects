package com.oppsdemo;

public  class ClassA implements Bonus {
	
	
	int salary;
	
	
	

	public ClassA(int salary) {
		super();
		this.salary = salary;
	}
	
	
	

	@Override
	public String toString() {
		return "ClassA [salary=" + salary + "]";
	}
	
	@Override
	public int getSalary() {
		
		 this.salary=this.salary+bonus;
		return this.salary;
	}
	
	
	
	
}

