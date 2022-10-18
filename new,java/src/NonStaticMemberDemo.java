
public class NonStaticMemberDemo {
	int num;    //non static variable

	NonStaticMemberDemo()
	 {
		 System.out.println("inside the constructer");//Constructor 
	 }

	{
		System.out.println("inside the non static block");//non static block 
	}

	public static void main(String[] args) {
		System.out.println("inside the main mathod");
		new  NonStaticMemberDemo(); //object creation

	}

}
