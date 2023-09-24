package DailyCoding;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 6;
		long temp = 0;
		for (long i = 1; i < n; i++) {
			if (n % i == 0) {
				temp += i;
			}

		}
		if (temp == n) {
			System.out.println("This a perfect Number");
		} else {
			System.out.println("Not a perfect Number");
		}
	}

}
