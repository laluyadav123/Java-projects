import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter the  number");  
		int n= sc.nextInt();  
		
		
		for(int i=0;i<=n;i++)
		{
			
			if(i%10!=0) 
		          contineu:
		        	  System.out.println(i);
			
			do
			{
				break;
			}
			while(i<=100);
		
		}
		
		}
	
}
