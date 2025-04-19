package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

//		Stream<Integer> ans =
//				list.stream().sorted().forEach(System.out::print);
//		System.out.println(ans);

		List<DetailValues> a = new ArrayList<>();

		a.add(new DetailValues("Manja", 1, 40000));
		a.add(new DetailValues("Muthu", 2, 20000));
		a.add(new DetailValues("Amruth", 3, 10000));
		a.add(new DetailValues("Ramesh", 4, 30000));

		List<DetailValues> ans = a.stream()
				.sorted(Comparator.comparingInt(DetailValues::getSalary))
				.collect(Collectors.toList());
		System.out.println(ans);

		List<DetailValues> i = a.stream()
				.sorted(Comparator.comparing(DetailValues::getName))
				.collect(Collectors.toList());
		System.out.println(i);

		List<String> s = Arrays.asList("z", "g", "h", "a");

		s.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
	}

}
