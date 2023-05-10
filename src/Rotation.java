
public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCD";
		String s2 = "ABCD";
		if (isRotation(s1, s2)) {
			System.out.println("It is a reverse");
		} else {
			System.out.println("not a reverse");
		}
	}

	public static boolean isRotation(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		String temp = s1 + s1;
		if (temp.indexOf(s2) != -1) {
			return true;
		} else {
			return false;
		}
	}
}
