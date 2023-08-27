package DailyCoding;

public class RevWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Geeks";
		int n = str.length();
		revWord(str, n);
	}

	public static String revWord(String str, int n) {
		String temp = "";
		for (int i = n - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);

		}
		System.out.println(temp);
		return temp;
	}

}
