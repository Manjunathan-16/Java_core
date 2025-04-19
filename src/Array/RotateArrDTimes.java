package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrDTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 3;
		int arr[] = { 1, 2, 3, 4, 5 };
//		int arr[] ={2,4,6,8,10,12,14,16,18,20};
//		int n = arr.length;
//		int j = 0;
//		List<Integer> list = new ArrayList<>();
//		for (int i = d; i < n; i++) {
//			list.add(j, arr[i]);
//			j++;
//		}
//		for (int i = 0; i < d; i++) {
//			list.add(arr[i]);
//		}
//		System.out.println(list);
//		int z = 0;
//		for (int ans : list) {
//			arr[z] = ans;
//			z++;
//		}
//		System.out.println(Arrays.toString(arr));
		rotateArr(arr, d);
	}

	private static void rotateArr(int[] a, int d) {
		int n = a.length;
		int[] temp = new int[n];
		for (int i = 0; i < d; i++) {
			temp[i] = a[i];
		}
		System.out.println(Arrays.toString(temp));
		for (int i = 0; i < n - d; i++) {
			a[i] = a[i + d];
		}
		for (int i = 0; i < d; i++) {
			a[n - d + i] = temp[i];
		}
		System.out.println(Arrays.toString(a));
	}
}
