package DailyCoding;

public class ImmediateSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a[] = { 5, 6, 2, 3, 1, 7 };
		int a[] = { 4, 2, 1, 5, 3 };
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				System.out.print(a[i + 1] + " ");
			} else {
				System.out.print(-1 + " ");
			}
		}
		System.out.print(-1 + " ");
	}

}
