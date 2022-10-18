package com.internBonusCalculation;

public class Interns {
	
	private String internName;
	private int internId;
	 int internSalary;
	
          
	
	public int getInternSalary() {
		return internSalary;
	}


	public void setInternSalary(int internSalary) {
		this.internSalary = internSalary;
	}


	@Override
	public String toString() {
		return "Interns [internName=" + internName + ", internId=" + internId + "";
	}
	
	
	public String getInternName() {
		return internName;
	}
	public void setInternName(String internName) {
		this.internName = internName;
	}
	public int getInternId() {
		return internId;
	}
	public void setInternId(int internId) {
		this.internId = internId;
	}
	
	
	

}
