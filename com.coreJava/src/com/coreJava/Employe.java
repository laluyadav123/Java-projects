package com.coreJava;

public class Employe {

	int id;
	String name;
	double salary;

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public Employe(int ide, String nam, int salar) {
		this.id = ide;
		this.name = nam;
		this.salary = salar;
	}

	public void texDeduction() {

		this.salary = this.salary - (0.01 * this.salary);

	}

}
