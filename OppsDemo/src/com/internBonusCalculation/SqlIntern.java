package com.internBonusCalculation;

public class SqlIntern extends Interns implements DuseraBonus {


	@Override
	public void afterBonus() {
		
		this.internSalary =this.internSalary+Bonus;
		
		
	}
	@Override
	public String toString() {
		return "SqlIntern [internSalary=" + internSalary+ "]";
	}
	


}
