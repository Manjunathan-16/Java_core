package InterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "manjunathan";
		revrStr(s);
	}

	public static String revrStr(String s) {
		StringBuilder sb = new StringBuilder();
		String ans = "";
		int i = 0;
		int n = s.length() - 1;
		while (n >= i) {

			// To reverse a string and remove duplicates and spaces
			String endChar = s.charAt(n) + "";
			if (ans.contains(endChar) || s.charAt(n) == ' ') {
				n--;
			} else {
				ans += s.charAt(n);
				n--;
			}

//			sb.append(s.charAt(n));
//			n--;
		}
		System.out.println(ans);
		System.out.println(sb);
		return sb.toString();
	}
}
