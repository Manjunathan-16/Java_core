package BasicMaths;

public class AllDivsor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 36;
		divisor(n);
	}

	// Method for checking all the divisor of given number
	public static void divisor(int n) {
		System.out.print("The divisor of " + n + " are : ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
