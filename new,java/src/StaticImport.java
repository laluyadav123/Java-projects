import java.util.Scanner;
import java.lang.*;

public class StaticImport {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter the first  number:");  
		int a= sc.nextInt();
		double b= Math.sqrt(a);
		System.out.println("squareroot is="+b);
		System.out.println("enter the second no:");
		int c= sc.nextInt();
		double d= Math.pow(a,c);
		System.out.println("power is="+d);
	}

}
