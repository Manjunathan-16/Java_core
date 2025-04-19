package Sorting;

import java.util.Arrays;

public class Merge2SortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = { 1, 3, 5, 7, 9 };
		int[] a2 = { 2, 4, 6, 8, 10 };
		int[] res = new int[a1.length + a2.length];

		int i = 0, j = 0, k = 0;

		while (i < a1.length && j < a2.length) {
			if (a1[i] <= a2[j]) {
				res[k++] = a1[i++];
			} else {
				res[k++] = a2[j++];
			}
		}

		while (i < a1.length) {
			res[k++] = a1[i++];
		}
		while (j < a2.length) {
			res[k++] = a2[j++];
		}
		System.out.println(Arrays.toString(res));
	}

}
