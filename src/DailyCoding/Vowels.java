package DailyCoding;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a i u e o t m n s w";
		int v = 0;
		int c = 0;

		String vowels = "aeiou";

		for (int i = 0; i < s.length(); i++) {
			char curChar = s.charAt(i);
			if (Character.isLetter(curChar)) {
				if (vowels.indexOf(curChar) > -1) {
					c++;
				} else {
					v++;
				}
			}
		}
		System.out.println(c + " " + v);
		// Your code here

		if (v > c)
			System.out.print("Yes");
		else if (c > v)
			System.out.print("No");
		else
			System.out.print("Same");

		System.out.println();
	}

}
