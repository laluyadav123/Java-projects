package com.coreJava;

public class Test {

	public static void main(String[] args) {
		
		Employe e = new Employe(101, "Akarsh", 25000);
		Employe e1 = new Employe(102, "aryan", 26000);
		Employe e2 = new Employe(103, "lalit", 27000);
		Employe e3 = new Employe(104, "rishab", 28000);
		Employe e4 = new Employe(105, "gaurav", 29000);
		e.texDeduction();
		e1.texDeduction();
		e2.texDeduction();
		e3.texDeduction();
		e4.texDeduction();
		
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
	//	System.out.println("show array content");
		//Employe arr[]= {e,e1,e2,e3,e4};
		
		/*	for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
	}	*/	
	}

}
