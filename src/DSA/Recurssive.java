package DSA;

public class Recurssive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int i = 1;
		name(n, i);
	}

	public static void name(int n, int i) {
		if (n > 0) {
			System.out.println(n);
			i++;
			n--;
			name(n, i);
		}
	}
}
