package DailyCoding;

public class PallindArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 121, 131, 111 };
		boolean ans = true;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int a = arr[i], temp = 0, r = a, sum = 0;

			// To check whether its palindrome or not for every array element
			while (a > 0) {
				temp = a % 10;
				sum = sum * 10 + temp;
				a = a / 10;
			}
			if (sum != r) {
				ans = false;
				break;
			}
		}
		
		//If one of the array if not palindrome return not as output
		if (ans == false) {
			System.out.println("not");
		} else {
			System.out.println("yes");
		}
	}
}