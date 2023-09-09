package DailyCoding;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		for (int i = n; i > 0; i--) {
			for (int j = n; j > 0; j--) {
				for (int k = 0; k < i; k++) {
					System.out.print(j + " ");
				}
			}
			System.out.print("$");
		}
	}

}
