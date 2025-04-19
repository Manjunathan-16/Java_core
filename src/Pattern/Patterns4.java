package Pattern;

public class Patterns4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3;
		erectpattern(N);
		invertedPattern(N);
	}

	// Method for erect pyramid
	public static void erectpattern(int N) {
		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < N - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	// Method for inverted pyramid
	public static void invertedPattern(int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * (N - i) - 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
