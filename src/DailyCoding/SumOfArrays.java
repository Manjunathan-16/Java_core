package DailyCoding;

public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4 };
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			temp += arr[i];
		}
		System.out.println(temp);
	}

}
