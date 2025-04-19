package String;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  hello world  ";
		String[] words = s.trim().split("\\s");
		String ans = "";
		int n = words.length;
		for (int i = n - 1; i >= 0; i--) {
			ans += words[i];
			if (i != 0) {
				ans += " ";
			}
		}
		System.out.println(ans);
	}

}
