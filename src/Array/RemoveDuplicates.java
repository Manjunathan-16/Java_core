package Array;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 2, 2, 3, 3, 4, 5, 6 };
		int n = a.length;
		int i = 0;
		int j = 1;

		while (j < n) {
			if (a[i] != a[j]) {
				i++;
				a[i] = a[j];
			}
			j++;
		}

		for (int k = 0; k <= i; k++) {
			System.out.print(a[k] + " ");
		}

//		List<Integer> list = new ArrayList<>();
//		for(int z=0;z<n;z++) {
//			if(!list.contains(a[z])) {
//				list.add(a[z]);
//			}
//		}
//		System.out.println(list);
	}

}
