package com.Interface;

public class JavaTrainer extends Trainer implements Bonus,Taxcalculation {

	int salary;
	
	
	public JavaTrainer(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "JavaTrainer [salary=" + salary + "]";
	}


	@Override
	public int taxCal() {
		
		this.salary=this.salary+bonus;
		return this.salary;
	}



	
	

}
