package DailyCoding;

import java.util.ArrayList;

public class DuplicatesArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 1, 2, 3 };
		// int arr[] = {0,3,1,2};
		int n = arr.length;
//		boolean flag = false;
//		for (int i = 0; i < n - 1; i++) {
//			// System.out.println("i "+ arr[i]);
//			for (int j = i + 1; j < n; j++) {
//				// System.out.println("j "+ arr[j]);
//				if (arr[i] == arr[j]) {
//					System.out.print(arr[i] + " ");
//					flag = true;
//				}
//			}
//		}
//		if (flag == false) {
//			System.out.println("No duplicate item found in the array");
//		}
		ArrayList<Integer> dupList = duplicates(arr, n);
		if (dupList.get(0) == -1) {
			System.out.println("No duplicates");
		} else {
			System.out.println("Duplicates list " + dupList);
		}
	}

	public static ArrayList<Integer> duplicates(int arr[], int n) {
		// code here
		int count[] = new int[n];
		for (int i = 0; i < n; i++) {
			count[arr[i]]++;
		}
		ArrayList<Integer> ar = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (count[i] > 1) {
				ar.add(i);
			}
		}
		if (ar.size() == 1) {
			ar.add(-1);
		}

		return ar;
	}
}
