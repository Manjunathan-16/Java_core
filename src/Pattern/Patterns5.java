package Pattern;

public class Patterns5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		pattern(N);
	}
	// Method for half pyramid pattern
	public static void pattern(int N) {
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i < N; i++) {
			for (int j = i; j < N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
