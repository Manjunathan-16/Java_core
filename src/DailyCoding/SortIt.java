package DailyCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 5, 4, 7, 10 };
		int n = a.length;
		List<Long> oddNumber = new ArrayList<>();
		List<Long> evenNumber = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 1) {
				oddNumber.add((long) a[i]);
			} else {
				evenNumber.add((long) a[i]);
			}
		}
		Collections.sort(oddNumber, Collections.reverseOrder());

		for (Long m : oddNumber) {
			System.out.println(m);
		}
		for (Long o : evenNumber) {
			System.out.println(o);
		}

	}
}
