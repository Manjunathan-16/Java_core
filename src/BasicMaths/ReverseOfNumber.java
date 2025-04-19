package BasicMaths;

public class ReverseOfNumber {

	public static int temp = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121;

		Reverse(n);

		// To check weather given number is palindrome or not
		if (n == temp) {
			System.out.println("It is a palindrome");
		} else
			System.out.println("It is not a palindrome");
	}

	// Reversing the given number
	public static void Reverse(int n) {

		while (n != 0) {
			int digit = n % 10;
			temp = temp * 10 + digit;
			n = n / 10;

		}
		System.out.println(temp);

//      This code changes is of complexity O(log n)
//		while (n != 0) {
//			int digit= n % 10;
//			n = n / 10;
//			System.out.print(digit);
//		}
	}

}
