package Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 1, 3, 9, 7 };
		int n = arr.length;
		insert(arr, n);
	}

	private static void insert(int arr[], int n) {
		// Your code here
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1; 

			while (j >= 0 && arr[j] > key) { 
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		System.out.println(Arrays.toString(arr));
	}
}
