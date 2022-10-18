package com.inheritance.lalu;

public class InheritanceDemo {

	public static void main(String[] args) {
		CreaditCardCustomer cc = new CreaditCardCustomer();
	
		cc.setName("Ayran");
		cc.setPhonNo(3453666);
		cc.setCreaditCardlimit(200000);
		
		DebitCardCustomer dc = new DebitCardCustomer();
		dc.setDebitCardLimit(100000);

		System.out.println(cc.getName());
		System.out.println(cc.getPhonNo());
		
		System.out.println("creadit limit :" + cc.getCreaditCardlimit());
		System.out.println("debit limit: " + dc.getDebitCardLimit());

	}

}
