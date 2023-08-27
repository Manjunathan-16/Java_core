import java.math.BigInteger;

public class MultiplyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String s1="0033";
		// String s2="2";
		// int a1=Integer.parseInt(s1);
		// int a2=Integer.parseInt(s2);
		// int ans = a1 * a2;
		// System.out.println(ans);
		
		System.out.println(multiplyStrings("2", "4"));
	}

	public static String multiplyStrings(String s1, String s2) {
//		int a1 = Integer.parseInt(s1);
//		int a2 = Integer.parseInt(s2);
//		int ans = a1 * a2;
//		return String.valueOf(ans);
		
		BigInteger b1 = new BigInteger(s1);
		BigInteger b2 = new BigInteger(s2);
		BigInteger ans = b1.multiply(b2);
		return ans.toString();
	}

}
