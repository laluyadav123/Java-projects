
public class Test1 {

	public static void main(String[] args) {
		Patient p = new Patient();
		p.setId(101);
		p.setName("Aryan");
		p.setSsn("123NSS23");
		
		System.out.println("ID :" + p.getId());
		System.out.println("Name:" + p.getName());
		System.out.println("SSN :" + p.getSsn());

	}

}
