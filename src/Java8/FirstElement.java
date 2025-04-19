package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>(Arrays.asList("Amruth", "Muthu", "Manja", "Ramesh"));
		list.stream().findFirst()
		.ifPresent(System.out::println);
	}

}
