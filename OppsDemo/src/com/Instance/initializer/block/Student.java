package com.Instance.initializer.block;

public class Student {
	
	private String name;
	private String serName;

	private int id;
	
	
	
	{
		id=101;
	}


	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSerName() {
		return serName;
	}



	public void setSerName(String serName) {
		this.serName = serName;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", serName=" + serName + ", id=" + id + "]";
	}



}



