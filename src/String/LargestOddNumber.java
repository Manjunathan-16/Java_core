package String;

public class LargestOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "632";
		System.out.println(oddNumber(num));

	}

	private static String oddNumber(String num) {
		int n = num.length();
		if ((int) num.charAt(n - 1) % 2 == 1) {
			return num;
		}
		int i = n - 1;
		while (i >= 0) {
			int val = (int) num.charAt(i) ;
			if (val % 2 == 1) {
				return num.substring(0, i+1);
			}
			i--;
		}
		return "";
	}
}
