package Array;

import java.util.*;
public class CheckSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]
//				= {1,2,3,4,5};
				= { 4, 3, 2, 1 };
		int n = a.length;

		for (int i = 1; i < n; i++) {
			if (a[i - 1] > a[i]) {
				System.out.println(false);
				System.exit(0);
			}
		}
		System.out.println(true);
	}
}
