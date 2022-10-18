package com.internBonusCalculation;

public class PythonIntern extends Interns implements DiwaliBonus{


	@Override
	public void afterBonus() {
		
		this.internSalary =this.internSalary+Bonus;
		
		
	}
	@Override
	public String toString() {
		return "PythonIntern [internSalary=" + internSalary+ "]";
	}
	

}


