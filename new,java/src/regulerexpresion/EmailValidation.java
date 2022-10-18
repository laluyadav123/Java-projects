package regulerexpresion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$");
	     Matcher matcher = pattern.matcher("senseilalu786@gmail.com");
	     if(matcher.matches())
	     {
	    	 System.out.println("valid email");
	     }else
	     {
	    	 System.out.println("invalid email");
	     }
	     
	

	}

}
