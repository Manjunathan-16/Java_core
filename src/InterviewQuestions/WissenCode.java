package InterviewQuestions;

public class WissenCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 3, 4, -2, 5, 2 };
		int n = arr.length;
		int i = 0;
		int j = i + 3;
		int ans = -1;
		while (j < n - 1) {
			int temp = arr[i] + arr[i + 1];

			int temp1 = arr[j] + arr[j + 1];

			if (temp == temp1) {
				ans = i+2;
				break;
			}
			i++;
			j++;
		}
		System.out.println(ans);
	}

}
