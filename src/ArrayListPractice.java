import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
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
