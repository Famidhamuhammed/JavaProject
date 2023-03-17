package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"anoop","famidha","ehaan","raiha"};
		System.out.println("The 2nd name of te array is "+names[1]);
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("anoop");
		list1.add("famidha");
		list1.add("ehaan");
		list1.add("raiha");
		
		
		System.out.println("the list is "+list1);
		System.out.println("the size of the list is "+list1.size());
		System.out.println("the 1st name in the list  is "+list1.get(0));
		System.out.println("the last name in the list is "+list1.get(list1.size()-1));
		
		list1.set(1, "Andrew");   // to udapte the data at index
		System.out.println("The list after udating Smith " + list1);
		
		list1.remove(2);  // to remove the data from list at index
		System.out.println("The list after deleting Leena " + list1);
		
		
		// Iterate through the list
		
		for(int i=0;i<list1.size();i++) {
			
			System.out.println("Element name " + list1.get(i));
		}
		
		
		for(String value:list1) {
			
			System.out.println("Element value " + value);
		}
		
		Iterator<String> itr = list1.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		Collections.sort(list1);
		System.out.println("After sorting the list " + list1);
		
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("After sorting in descending order " + list1);

		
		


		
		




		

	}

}
