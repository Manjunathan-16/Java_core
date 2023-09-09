package DailyCoding;

public class BinSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 0, 1, 1, 0, 1, 0, 1 };
		int n = a.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				count++;
				System.out.println(a[i]);
			}
		}
		for (int i = count; i < n; i++) {
			a[i] = 1;
			System.out.println(a[i]);
		}
	}

}
