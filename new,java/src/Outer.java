
public class Outer {
	
	static void f1(){
		
		System.out.println("Inside the outer class");
	}
	
	static class inner{
		
		static void f2() {
			System.out.println("inside the inner class");
		}
	}

	public static void main(String[] args) {
		
		Outer.f1();
		Outer.inner.f2();
	

	}

}
