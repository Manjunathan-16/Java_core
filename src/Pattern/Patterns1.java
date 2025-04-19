package Pattern;

public class Patterns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		pattern(N);
	}

	//Method to display a "square" or a "grid" pattern
	public static void pattern(int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
