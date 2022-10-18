package nonstaticinnerclass;

public class Outer {
	void f1() {
		System.out.println("inside the Outer nonstaticclass");
	}
	
	class Inner{
		void f2() {
			System.out.println("inside the Inner nonstaticclass");
		}
	}
	

	public static void main(String[] args) { 
		
		Outer o = new Outer();
		o.f1();
		Outer.Inner inner = new Outer().new Inner(); 
		inner.f2();

	}

}
