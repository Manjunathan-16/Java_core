package Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,3,4,5,6,6};
		List<Integer> list = Arrays.asList(1,2,3,3,4,5,6,6);
		Set<Integer> set = new HashSet<>();
		
		// To print only actual element and remove duplicates 
//		List<Integer> a = list.stream().distinct().collect(Collectors.toList());
		Long b = list.stream().distinct().count();
		System.out.println(b);
		
		list.stream().distinct().forEach(System.out::print);
		
		// To get the count of the array 
		long count = list.stream().count();
		System.out.println("Count value:"+count);
		
		// To get the count of array by removing duplicate
		long counts = list.stream().filter(n-> set.add(n)).count();
		System.out.println("Duplicate elements is removed and its count:"+counts);
		
		List<Integer> l = Arrays.asList(1,2,3,3,4,5,6,6);
		Set<Integer> s = new HashSet<>();
		
		List<Integer> a = l.stream().filter(n -> s.add(n)).collect(Collectors.toList());
		System.out.println(a);
		
		List<Integer> dup = Arrays.asList(1,1,3,3,4,5,5,6,6);
		
		List<Integer> res = dup.stream().collect(Collectors.groupingBy(n ->n , Collectors.counting()))
		.entrySet().stream().filter(n -> n.getValue() == 1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		System.out.println("Dup - "+ res);
		
		List<String> ban = Arrays.asList("Bangalore", "Bengaluru", "India" , "Region");
		Stream<String> ans = ban.stream().filter(n -> n.startsWith("B"));
		
		String v = ans.collect(Collectors.joining(", "));
		System.out.println("v - "+v);
//		ans.forEach(System.out::print);
		
		
		List<String> ber = Arrays.asList("Bangalore", "Bengaluru", "India" , "Region");
		Optional<String> o = ber.stream().filter(n -> n.endsWith("u")).findFirst();
		
		o.ifPresent(System.out::print);
		
	}
}
