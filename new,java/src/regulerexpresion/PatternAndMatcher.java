package regulerexpresion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("xyz");
	     Matcher matcher = pattern.matcher("abcdexyzsgdhxyzkshdgsxyz");
	     
	     while(matcher.find()) {
	    	 System.out.println(matcher.start());
	    	 System.out.println(matcher.end());
	    	 System.out.println(matcher.group());
	     }

	}

}
