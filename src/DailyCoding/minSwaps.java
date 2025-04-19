package DailyCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class minSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = { 2, 8, 5, 4 };
		int[] nums = { 10, 19, 6, 3, 5 };
		int n = nums.length;
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(nums[i], i);
		}
		System.out.println(map);
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < n; i++) {
			System.out.println(i + ":" + map.get(nums[i]));
			if (i == map.get(nums[i])) {
				continue;
			} else {
				count++;
				swap(nums, i, map.get(nums[i]));
				i--;
			}
		}
		System.out.println(count);
	}

	public static void swap(int[] arr, int x, int y) {
		int t = arr[x];
		arr[x] = arr[y];
		arr[y] = t;
	}

}
