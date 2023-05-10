import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strings());

	}

	public static String strings() {
		String[] strs = { "flower", "flow", "flight" };
		Arrays.sort(strs);
		String first = strs[0];
		String last = strs[strs.length - 1];
		int c = 0;
		while (c < first.length()) {
			if (first.charAt(c) == last.charAt(c)) {
				c++;
			} else {
				break;
			}
		}
		if (c == 0) {
			return "No common prefix";
		} else {
			return first.substring(0, c);
		}
	}
}
