package araayutil;

import java.util.Arrays;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		/*
		 * int a[] = { 10, 40, 30, 20 }; System.out.println("before Sorting"); for (int
		 * i : a) { System.out.println(i); } Arrays.sort(a);
		 * System.out.println("before Sorting"); for (int i : a) {
		 * System.out.println(+i); }
		 */

		String[] s = { "A", "Z", "R", "D" };

		System.out.println("Elements Are:");
		Arrays.sort(s, new MyComparitor());

		for (String j : s) {

			System.out.println(j);

		}
		int result = Arrays.binarySearch(s, "Z");
		System.out.println("Index Of Z:" + result);

		List<String> list = Arrays.asList(s);
		s[2]="Y";
		System.out.println(list);
		

	}
}
