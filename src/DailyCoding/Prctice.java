package DailyCoding;

import java.util.HashMap;

public class Prctice {

	public static void main(String[] args) {
		int[] a = { 1, 7, 4, 8, 3, 8, 7 };
		int n = a.length;
		int k = 2;
//		int count = 1;
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (a[i] == a[j]) {
//					count++;
//				}
//			}
//			if (count == k) {
//				System.out.println(a[i]);
//				System.exit(0);
//			}
//			count = 1;
//		}
//		System.out.println("-1");

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (hm.containsKey(a[i])) {
				hm.replace(a[i], hm.get(a[i]), hm.get(a[i]) + 1);
				if (hm.get(a[i]) == k) {
					System.out.println(a[i]);
					System.exit(0);
				}
			} else {
				//hm.put(a[i], 1);
				System.out.println(hm.put(a[i], 1));
				if (hm.get(a[i]) == k) {
					System.out.println(a[i]);
					System.exit(0);
				}
			}
		}
		System.out.println(-1);
	}
}