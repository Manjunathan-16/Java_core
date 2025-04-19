package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllJava8Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Separate odd and even numbers
//		List<Integer> list = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
//		Map<Boolean, List<Integer>> num = list.stream()
//		.collect(Collectors.partitioningBy(n -> n%2 == 0));
//		System.out.println(num);
//		for(Map.Entry<Boolean, List<Integer>> ans : num.entrySet()) {
//			if(ans.getKey().equals(true)) {
//				System.out.println(ans.getValue());
//			}else {
//				System.out.println(ans.getValue());
//			}
//		}
// {false=[71, 21, 67, 95, 87], true=[18, 42, 32, 14, 56]}

		// Remove Duplicate elements from list
//		List<String> list = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
//		List<String> ans = list.stream().distinct().collect(Collectors.toList());
//		System.out.println(ans);
//		[Java, Python, C#, Kotlin]

		// How do you find frequency of each element in an array or a list?
//		List<String> list = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
//		Map<String , Long> a = list.stream().collect(Collectors.groupingBy
		// (Function.identity(),Collectors.counting()));
//		System.out.println(a);
//		{Pen=2, Stapler=1, Pencil=2, Note Book=2, Eraser=1}

		// How do you sort the given list of decimals in reverse order?
//		 List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
//		 decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		// From the given list of integers, print the numbers which are multiples of 5?
//		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//		listOfIntegers.stream().filter(n -> n % 5 ==0).forEach(System.out::print);
//		45 15 75

		// Given a list of integers, find maximum and minimum of those numbers?
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//		int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
//		int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
//		System.out.println(max+" "+min);
//		89 12

		// Same above with out using get saving in Optional
//		Optional<Integer> a = listOfIntegers.stream().max(Comparator.naturalOrder());
//		System.out.println(a);

		// How do you get three maximum numbers and three minimum numbers from the given
		// list of integers?
//		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//		listOfIntegers.stream().sorted().limit(3).forEach(System.out::print);
//		listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::print);
//		Minimum 3 Numbers 12 15 24 Maximum 3 numbers 89 75 56

		// Java 8 program to check if two strings are anagrams or not?
//		String s1 = "RaceCar";
//	    String s2 = "CarRace";
//	    s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted()
		// .collect(Collectors.joining());
//	    s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted()
		// .collect(Collectors.joining());
//	    if(s1.equals(s2)) {
//	    	System.out.println("Anagram");
//	    }else {
//	    	System.out.println("Not an anagram");
//	    }

		// Find second largest number in an integer array?
//		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//		int ans = listOfIntegers.stream().sorted(Comparator.reverseOrder())
		// .skip(1).findFirst().get();
//		System.out.println(ans);
//		75

		// Given a list of strings, sort them according to increasing order of their
		// length?
//		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
//		listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::print);
//      CC#C++JavaHTMLCOBOLPythonKotlin

		// Last element of an array
//		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//		int ans = listOfIntegers.stream().skip(listOfIntegers.size()-1).findFirst().get();
//		System.out.println(ans);
//      89

		// Find the length of the unique String by split , and
		String s = "chennai,bangalore,coimbatore,chennai,bangalore,erode";
//		long ans = Stream.of(s.split(",")).distinct().count();
//		System.out.println(ans);

		List<String> listO = Arrays.asList(s.split(","));
		List<String> a = listO.stream().filter(n -> n.startsWith("c")).collect(Collectors.toList());
		System.out.print(a);

		listO.stream().filter(b -> b.endsWith("i")).distinct().forEach(System.out::println);

		listO.stream().filter(i -> i.contains("b")).forEach(System.out::print);

//		List<String> list = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
//		list.stream().map(String::length).forEach(System.out::println);

		List<String> list = Arrays.asList("one", "two", "three", "four");

		Map<Object, List<String>> result = list.stream().collect(Collectors.groupingBy(n -> n.length()));
		System.out.println(result);
	}
}
