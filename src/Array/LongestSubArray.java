package Array;

public class LongestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3, k = 5, array[] = 
			{ 2, 3, 5};
//		{-1, 1, 1};

		int left = 0;
		int right = 0;
		int a = array[0];
		int len = 0;
		while (right < n) {
			if (left <= right && a > k) {
				a -= array[left];
				left++;
			}
			if (a == k) {
				len = Math.max(len, right - left + 1);
			}

			right++;
			if (right < n) {
				a += array[right];
			}
		}
		System.out.println(len);
	}
}