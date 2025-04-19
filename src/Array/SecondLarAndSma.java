package Array;

public class SecondLarAndSma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 4, 7, 7, 5 };
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		int secLarg = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int secSmall = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			// To Find second largest  
			if (arr[i] > max) {
				secLarg = max;
				max = arr[i];
			} else if (arr[i] > secLarg && arr[i] != max) {
				secLarg = arr[i];
			}
			
			// To Find second smallest 
			if (arr[i] < min) {
				secSmall = min;
				min = arr[i];
			} else if (secSmall > arr[i] && arr[i] != min) {
				secSmall = arr[i];
			}
		}
		System.out.println("Second Largest - " + secLarg);
		System.out.println("Second Smallest - " + secSmall);
	}

}
