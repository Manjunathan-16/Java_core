import java.util.Arrays;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method("day abc bdhight"));
	}

	public static int method(String s) {
		int res = 0;
		if (s.length() == 1) {
			return 1;
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				res++;
			} else {
				if (res > 0) {
					return res;
				}
			}
		}
		return res;
	}
}
