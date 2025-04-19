package Pattern;

public class Patterns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		pattern(N);
		System.out.println();
		pattern2(N);
	}

	//Method to display a right-angled triangle pattern
	public static void pattern(int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	//Method to display a inverted right-angled triangle pattern
	public static void pattern2(int N) {
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
