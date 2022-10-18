
public class Test {

	public static void main(String[] args) {
		ElectrcityBill electrcityBill = new ElectrcityBill();
		electrcityBill.setMeterno(100);
		electrcityBill.setName("Lalu");
		electrcityBill.setAddress("Etah");
		System.out.println(electrcityBill);
		
		ElectrcityBill electrcityBill2 = new ElectrcityBill();
		electrcityBill2.setMeterno(100);
		electrcityBill2.setName("Lalu");
		electrcityBill2.setAddress("Etah");
		
		System.out.println(electrcityBill.equals(electrcityBill2));
		System.out.println(electrcityBill.hashCode());

	}

	
}
