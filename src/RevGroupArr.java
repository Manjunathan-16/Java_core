import java.util.ArrayList;

public class RevGroupArr {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int n = arr.size();
		int k = 3;
		search(arr, n, k);
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	static void search(ArrayList<Integer> arr, int n, int k) {
		for (int i = 0; i < n; i = i + k) {
			int left = i;
			int right = i + k - 1;
			if (right >= n) {
				right = n - 1;
			}

			while (left < right) {
				int temp = arr.get(left);
				arr.set(left, arr.get(right));
				arr.set(right, temp);
				left++;
				right--;
			}
		}
	}
}
