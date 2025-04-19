package DSA;

public class StringRevRecurssive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "manju";
		name(s);
	}
	public static void name(String s) {
		if(s.isEmpty()) {
			return;
		}
		name(s.substring(1));
		System.out.print(s.charAt(0));
	}
}
