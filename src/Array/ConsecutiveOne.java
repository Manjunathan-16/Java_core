package Array;

public class ConsecutiveOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 0, 1, 1, 1 };
		int n = arr.length;
		int count = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				count++;
			} else {
				count = 0;
			}
			ans = Math.max(ans, count);
		}
		System.out.println(ans);
	}

}
