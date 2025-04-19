package ArrayList;

import java.util.ArrayList;

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

}
