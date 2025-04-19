package DailyCoding;

public class AddTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nums1 = "111";
		String nums2 = "23";
		int i = nums1.length() - 1;
		int j = nums2.length() - 1;
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		while (i >= 0 || j >= 0 || carry > 0) {
			int n1 = 0;
			int n2 = 0;
			if (i >= 0) {
				n1 = nums1.charAt(i) - '0';
				i--;
			}
			if (j >= 0) {
				n2 = nums2.charAt(j) - '0';
				j--;
			}
			int num = (n1 + n2 + carry) % 10;
			carry = n1 + n2 + carry >= 10 ? 1 : 0;
			sb.append(num);
		}
		System.out.println(sb.reverse().toString());
	}
}
