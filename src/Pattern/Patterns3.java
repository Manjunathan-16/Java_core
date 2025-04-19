package Pattern;

public class Patterns3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		pattern1(N);
		System.out.println();
		pattern2(N);
		System.out.println();
		pattern3(N);
	}

	// Method for number triangle 
	public static void pattern1(int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i + 1);
			}
			System.out.println();
		}
	}

	public static void pattern2(int N) {
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	// Method for inverted number triangle 
	public static void pattern3(int N) {
		for (int i = N; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
