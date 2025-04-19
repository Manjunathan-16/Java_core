package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> tvShows = new ArrayList<>();
		tvShows.add("Breaking Bad");
		tvShows.add("Peaky Blinders");
		tvShows.add("GOT");
		tvShows.add("Money Heist");

		// Displaying using for each and lambda
		tvShows.forEach(display -> {
			System.out.println(display);
		});

		// Displaying using for each
		System.out.println("Displaying via for each");
		for (Object d : tvShows) {
			System.out.println(d);
		}

		// Diplaying using iterartor
		System.out.println("Printing through iterators ");
		Iterator<Object> d = tvShows.iterator();
		while (d.hasNext()) {
			System.out.println(d.next());
		}

		Sort();
		SortCompare();
	}

	// Sorting using collections.sort
	public static List<String> Sort() {
		String[] arr = { "lisa", "Mona", "Jiso", "Jeni" };
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		Collections.sort(list);
		for (String dis : list) {
			System.out.println(dis);
		}
		return list;
	}

	// Sorting using comparator method
	public static List<String> SortCompare() {
		String[] arr = { "lisa", "Mona", "Jiso", "Jeni" };
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		System.out.println("before : " + list);
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String list1, String list2) {
				// TODO Auto-generated method stub
				return list1.compareTo(list2);
			}
		});

		System.out.println(list);
		return list;
	}
}
