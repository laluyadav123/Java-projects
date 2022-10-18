package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToLowerCase {

	public static void main(String[] args) {
		
		
	List<String> l1 = new ArrayList<>();
	
	l1.add("LALU");
	l1.add("ARYAN");
	l1.add("LALIT");
	System.out.println(l1);
	
	
	List<String> l2 = l1.stream().map(s-> s.toLowerCase()).collect(Collectors.toList());
	
	System.out.println(l2);

	}

}
