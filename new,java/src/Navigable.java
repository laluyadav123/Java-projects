import java.util.TreeSet;

public class Navigable {

	public static void main(String[] args) {
		TreeSet<String> s =new TreeSet<>();
		
		s.add("lalit");
		s.add("aryan");
		s.add("rishab");
		s.add("gaurav");
		s.add("lalu");
		
		System.out.println(s);
		
		System.out.println(s.ceiling("lalit" ));
		System.out.println(s.higher("lalit" ));
		System.out.println(s.floor("rishab" ));
		System.out.println(s.lower("aryan" ));
		System.out.println(s.pollFirst( ));
		System.out.println(s.pollLast( ));
		System.out.println(s.descendingSet( ));

	}

}
