package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberStarting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,11,12));
		list.stream()
		.map(s -> s+ "")
		.filter(s -> s.startsWith("1"))
		.forEach(System.out::println);
	}

}
