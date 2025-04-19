package InterviewQuestions;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abba";
		
		// IF we are doing in a method use this approch
//		StringBuilder sb = new StringBuilder();
//		int i = s.length()-1;
//		while(i >= 0) {
//			sb.append(s.charAt(i));
//			i--;
//		}
//		String ans = new String(sb);
		String ans = strPali(s);
		if(ans.equals(s)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}
	public static String strPali(String s) {
		String res = "";
		int i = s.length()-1;
		while(i >= 0) {
//			sb.append(s.charAt(i));
			res += s.charAt(i);
			i--;
		}
		return res;
	}

}
