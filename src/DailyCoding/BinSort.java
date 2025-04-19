package DailyCoding;

import java.util.Arrays;

public class BinSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 0, 1, 1, 0, 1, 0, 1 };
		int n = a.length;
		int count = 0;
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				count++;
				//arr[i] = a[i];
				System.out.print(a[i]);
			}
		}
		for (int i = count; i < n; i++) {
			arr[i] = 1;
			System.out.print(a[i]);
		}
		System.out.print(Arrays.toString(arr));
	}

}
