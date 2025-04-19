package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,6,5,8,11}, target = 14;
		int n = arr.length;
		System.out.println(sum(arr,target,n));
		String res = Arrays.toString(indecies(arr,target,n));
		System.out.println(res);
	}

//	 Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
	private static String sum(int arr[],int target,int n) {
		Arrays.sort(arr);
		int i=0,j=n-1;
		
		while(i < j) {
			int sum = arr[i] + arr[j];
			if(sum > target) {
				j--;
			} else if(sum < target) {
				i++;
			} else if(sum == target) {
				return "Yes";
			}
		}
		return "No";
	}
	
//	Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.
	private static int[] indecies(int arr[],int target,int n) {
		Map<Integer,Integer> map = new HashMap<>();
		int[] a = new int[2];
		a[0]=a[1]=-1;
		for(int i=0;i<n;i++) {
			System.out.println("-"+i);
			int diff = target - arr[i];
			if(map.containsKey(diff)) {
				a[0] = map.get(diff);
				System.out.println(i);
				a[1] = i;
				return a;
			}
			map.put(arr[i], i);
		}
		return a;
	}
}
