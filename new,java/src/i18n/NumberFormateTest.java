package i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormateTest {

	public static void main(String[] args) {
		
		long a=123456789;
			
		NumberFormat nf = NumberFormat.getInstance(Locale.US);
		NumberFormat n = NumberFormat.getInstance(Locale.UK);
		System.out.println("US Format\n"+nf.format(a)+"\n" +"UK Format\n"+n.format(a));

	}

}
