package Java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Abhilash", "Mega", "Amruth", "Devon", "Daril", "Manja", "Darren", "Muthu",
				"Akshay");

		Map<Object, List<String>> ans = list.stream()
				.collect(Collectors.groupingBy(n -> n.charAt(0)));
		System.out.println(ans);

		List<String> res = list.stream()
				.collect(Collectors.groupingBy(n -> n.charAt(0)))
				.values()
				.stream()
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
		System.out.println(res);
		
		
		String input = "one two three five four one two";
		
		List<String> inputList = Arrays.asList(input.split(" "));
		
		Map<String,Long> map = inputList.stream()
				.collect(Collectors.groupingBy(n -> n ,Collectors.counting()));
		System.out.println(map);
	
	}

}
