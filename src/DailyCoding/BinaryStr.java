package DailyCoding;

public class BinaryStr {

	public static void main(String[] args) {
		String str = "100071";
		//Another way to execute this method
//		String ans = "";
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) != '0' && str.charAt(i) != '1') {
//				ans = "0";
//				break;
//			} else {
//				ans = "1";
//			}
//		}
//		System.out.println(ans);
		
		Boolean b =isBinary(str);
		if(b==true) {
			System.out.println("1");
		}else
			System.out.println("0");
	}

	static boolean isBinary(String str) {
		// Your code here
		Boolean ans = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '0' && str.charAt(i) != '1') {
				ans = false;
				break;
			}
		}
		return ans;
	}
}
