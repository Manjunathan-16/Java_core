package Array;

import java.util.Arrays;

public class leftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int k = 2;
		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void reverse(int[] arr,int first,int last) {
		while(first < last) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}
	}

}
