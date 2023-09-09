package DailyCoding;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "absa";
		int first = 0;
		int last = s.length() - 1;
		while (first < last) {
			if (s.charAt(first) != s.charAt(last)) {
				System.out.println("not");
				return;
			}
			first++;
			last--;
		}
		System.out.println("yes");
	}

}
