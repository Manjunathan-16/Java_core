
public class Special {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "chitra123@!#$$";
		String noSpecialChar="";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))
					&& !(Character.isLetter(s.charAt(i)))) {
				count++;
			}
			else {
				noSpecialChar= noSpecialChar +s.charAt(i);
			}
		}
		if (count == 0) {
			System.out.println("There are no special character");
		} else {
			System.out.println("Number of special characters - " + count);
		}
		System.out.println("No special characters - "+noSpecialChar);
	}
}
