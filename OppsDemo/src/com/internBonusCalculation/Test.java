package com.internBonusCalculation;

public class Test {

	public static void main(String[] args) {
		
		
		
		DotNetIntern d = new DotNetIntern();
		d.setInternId(101);
		d.setInternName("Rishab");

		System.out.println(d.getInternId());
		System.out.println(d.getInternName());
	    d.setInternSalary(25000);
	    System.out.println("Fix salary :"+d.getInternSalary());
	    d.afterBonus();

		
		
		System.out.println("Afterbonus :"+d.getInternSalary());
		System.out.println(d);
		
		
		JavaIntern j = new JavaIntern();
		j.setInternId(102);
		j.setInternName("Aryan");

		System.out.println(j.getInternId());
		System.out.println(j.getInternName());
	    j.setInternSalary(25000);
	    System.out.println("Fix salary :"+j.getInternSalary());
	    j.afterBonus();

		
		
		System.out.println("Afterbonus :"+j.getInternSalary());
		System.out.println(j);
		
		
		PythonIntern p = new PythonIntern();
		p.setInternId(103);
		p.setInternName("Aryan");

		System.out.println(p.getInternId());
		System.out.println(p.getInternName());
	    p.setInternSalary(30000);
	    System.out.println("Fix salary :"+p.getInternSalary());
	    p.afterBonus();

		
		
		System.out.println("Afterbonus :"+p.getInternSalary());
		System.out.println(p);
		
		
		
	   

		 SapIntern Sa = new SapIntern();
			Sa.setInternId(104);
			Sa.setInternName("Lalit");

			System.out.println(Sa.getInternId());
			System.out.println(Sa.getInternName());
		    Sa.setInternSalary(35000);
		    System.out.println("Fix salary :"+Sa.getInternSalary());
		    Sa.afterBonus();

			
			
			System.out.println("Afterbonus :"+Sa.getInternSalary());
			System.out.println(Sa);
			
			
			 SqlIntern Sq = new SqlIntern();
				Sq.setInternId(105);
				Sq.setInternName("Gaurav");

				System.out.println(Sq.getInternId());
				System.out.println(Sq.getInternName());
			    Sq.setInternSalary(40000);
			    System.out.println("Fix salary :"+Sq.getInternSalary());
			    Sq.afterBonus();

				
				
				System.out.println("Afterbonus :"+Sq.getInternSalary());
				System.out.println(Sq);
				
				
	

	}

}
