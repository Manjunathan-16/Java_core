package DSA;

public class SumRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		sum(n, 0);
	}

	public static void sum(int n, int sum) {
		if (n < 1) {
			System.out.println(sum);
			return;
		}
		sum(n - 1, sum + n);
	}

}
