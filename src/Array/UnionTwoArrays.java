package Array;
import java.util.HashSet;
import java.util.Set;

public class UnionTwoArrays {

	// To find the count of the Array after adding union two arrayset
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 6 };

		Set<Integer> set = new HashSet<>();
		for (int i : a) {
			set.add(i);
		}
		for (int i : b) {
			set.add(i);
		}
		int ans = set.size();
		System.out.println(set);
		System.out.println(ans);
	}
}
