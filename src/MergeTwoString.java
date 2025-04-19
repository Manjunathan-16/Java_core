
public class MergeTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "pqr";
		
		int i=0,j=0;
		StringBuilder sb = new StringBuilder();
		while(i<s1.length() || j < s2.length()) {
			if(i<=j) {
				sb.append(s1.charAt(i));
				i++;
			} else {
				sb.append(s2.charAt(j));
				j++;
			}
		}
		System.out.println(sb.toString());
	}

}
