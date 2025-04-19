package BasicMaths;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345698;

		// Converting to String and getting its length
//		String s= Integer.toString(n);
//		System.out.println(s.length());

		countInteger(n);

	}

	// Counting the number of digits in the integer
	static int countInteger(int n) {
		int x = n;
		int count = 0;
		while (x != 0) {
			x = x / 10;
			count++;
		}
		System.out.println(count);
		return count;
	}
}
