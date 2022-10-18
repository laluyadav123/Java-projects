package com.internBonusCalculation;

public class DotNetIntern  extends Interns implements DiwaliBonus {


	@Override
	public void afterBonus() {
		
		this.internSalary =this.internSalary+Bonus;
		
		
	}
	@Override
	public String toString() {
		return "DotNetIntern [internSalary=" + internSalary+ "]";
	}
	

}
