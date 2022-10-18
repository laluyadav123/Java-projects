import java.util.*;  

public class PrimeNumbrer {

	public static void main(String[] args) {
		boolean primeFlage=true;
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter the  number");  
		int a= sc.nextInt();  
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				primeFlage=false;
			}
		}		
          if(primeFlage)
          {
        	  System.out.println("no is prime");
          }
          else
          {
        	  System.out.println("no is not prime");
          }
	}

}
