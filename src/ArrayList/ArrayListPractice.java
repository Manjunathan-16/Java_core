package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating array list and adding values
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		// creating new array list and added the previous arraylist value in it
		ArrayList<Integer> b = new ArrayList<>(a);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		
		// added a number in middle 
		b.add(3, 9);
		// Adding both results in a single new arraylist
		ArrayList<Integer> ans = new ArrayList<>();
		ans.addAll(b);
		System.out.println(ans);
	}
	
	public static void method() {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<>();
		ar.add("Manja");
		ar.add("Urali");
		ar.add("Devara");
		ar.add("Abhi");
		ar.add("Mega");
		// used it sort the values 
		Collections.sort(ar);
		
		// Displaying using iterator
		Iterator itr = ar.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Displaying using for each loop
		for (String s : ar) {
			System.out.println(s);
		}
		
		// Displaying using for loop
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
}
