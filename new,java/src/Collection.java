
import java.util.*;
public class Collection {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=10;i<=100;i=i+10)
		{
			list.add(i); // printing element of arraylist
		}
		System.out.println("elements are:"+list);
		
		list.add(5, 50); // inserting an element at any position in arraylist.
		System.out.println("after insertion "+list);
		
		
		list.set(5,100); //replacing any element in array list
		System.out.println("Element Replaced  "+list);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(444);
		list2.add(333);
		list2.add(222);
		list2.add(111);
		
		list.addAll(5, list2); //adding group of elements in another list
		
		System.out.println("Element of list2  "+list2);
		
		System.out.println("Element placed in list one  "+list);
		
		if(list.contains(334)) //the mathod "contains" is check weather element is in the arraylist or not.
		{
			System.out.println("list have the value");
		}else {
			System.out.println("element is missing");
		}
		
		for(int i=0;i<list.size();i++)//for geting or printing the all element in the list.
		{
			System.out.println("{.~.}"+list.get(i));
		}
		list.remove(5);// removing an element at any position in arraylist
		
		System.out.println("Element Replaced  "+list);

	}
	

}









