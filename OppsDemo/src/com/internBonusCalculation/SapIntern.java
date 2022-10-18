package com.internBonusCalculation;

public class SapIntern extends Interns implements DuseraBonus {


	@Override
	public void afterBonus() {
		
		this.internSalary =this.internSalary+Bonus;
		
		
	}
	@Override
	public String toString() {
		return "SapIntern [internSalary=" + internSalary+ "]";
	}
	
}
