import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> val = Arrays.asList(6, 2, 7, 4, 5, 1);
		// By using stream in a single line function
		val.stream().filter(n -> n % 2 == 1) // filtering with odd values
				.sorted() // sorting
				.map(n -> n * 2) // performing task
				.forEach(n -> System.out.println(n)); // printing the output

		// The code is same as above just by assigning each step to individual variable
		Stream<Integer> s = val.stream();
		Stream<Integer> p = s.filter(n -> n % 2 == 1);
		Stream<Integer> m = p.sorted();
		Stream<Integer> o = m.map(a -> a * 2);
		o.forEach(n -> System.out.println(n));

		// reducing into single value and displaying
//		int r = o.reduce( 0,(c,e)->c+e); // adding all values
//		System.out.println(r);
	}
}
