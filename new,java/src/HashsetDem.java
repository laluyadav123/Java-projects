import java.util.*;

public class HashsetDem {

	public static void main(String[] args) {
		
		Random obj = new Random();
		
		HashSet<Integer> set =new HashSet<>();
		
		for(int i=0;i<5;i++)
		{
			int number =  obj.nextInt(100);
			set.add(number);
		}
		System.out.println("Elements Are:" + set);

	}

}
