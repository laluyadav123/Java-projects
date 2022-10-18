import java.util.*;

public class SortedList {

	public static void main(String[] args) {
      List<String> s =new ArrayList<>();
		
		s.add("D");
		s.add("F");
		s.add("B");
		s.add("Z");
		s.add("A");
		
		System.out.println("before sorted"+s);
		
		Collections.sort(s);
		System.out.println("After  sorted"+s);
		
		Collections.reverse(s);
		System.out.println("After  sorted"+s);
		

	}

}
