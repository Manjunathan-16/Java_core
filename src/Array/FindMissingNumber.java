package Array;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]
//				= {1,3};
				= { 1, 2, 4, 5 };
		int N = 5;
		System.out.println(missingNumber(N,array));
	}
	
	private static int missingNumber(int N,int[] arr) {
		int sum = (N*(N+1))/2;
		int arrSum =0;
		for(int i=0;i<arr.length;i++) {
			arrSum += arr[i];
		}
		int res = sum - arrSum;
		return res;
	}

}
