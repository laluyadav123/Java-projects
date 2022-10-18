package com.internBonusCalculation;

public class JavaIntern extends Interns implements DuseraBonus{

	@Override
	public void afterBonus() {
		
		this.internSalary =this.internSalary+Bonus;
		
		
	}
	@Override
	public String toString() {
		return "JavaIntern [internSalary=" + internSalary+ "]";
	}
	

}
