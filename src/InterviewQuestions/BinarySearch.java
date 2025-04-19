package InterviewQuestions;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		int k = 4;
		int ans = binSrh(arr, k);
		System.out.println(ans);
	}

	public static int binSrh(int arr[], int k) {
		int first = 0;
		int last = arr.length - 1;
		while (first <= last) {
			int mid = first + (last - first) / 2;
			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid] < k) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		return 0;
	}
}
