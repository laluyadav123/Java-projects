
public class GradingApp {

	public static void main(String[] args) {
		int math=70,physics=74,chemistry=74,average=0;
		average=(math+physics+chemistry)/3;
		System.out.println("Average is="+average);
	
        if(average<=59)
        {
        	System.out.println("Grade = C");
        }
        else if(average<=69)
        {
        	System.out.println("Grade = B");
        }
        else
        {
        	System.out.println("Grade = A");
        }
        
        if(math<=35)
        {
        	System.out.println("failed");
        }
        else if(physics<=35) 
        {
        	System.out.println("failed");
        }
        else if(chemistry<35)
        {
        	System.out.println("failed");
        }
        else
        {
        	System.out.println("passed");
        }
	}

}
