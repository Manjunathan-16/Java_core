package DailyCoding;

class Pair {
	long first, second;

	public Pair(long first, long second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		return ("min-" + first + " and " + "max-" + second);
	}
}

public class MinAndMax {

	public static void main(String[] args) {
		long a[] = { 1, 345, 234, 21, 56789 };
		long n = a.length;
		Pair p = getMinMax(a, n);
		System.out.println(p.toString());
		
		//We can do this directly in main method with below logic
//		long first = a[0];
//		long last = a[0];
//
//		for (int i = 0; i < n; i++) {
//			if (a[i] > first)
//				first = a[i];
//			if (a[i] < last)
//				last = a[i];
//		}
//		System.out.println(last + " and " + first);
	}

	public static Pair getMinMax(long a[], long n) {
		long min = a[0];
		long max = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		return new Pair(min, max);
	}
}
