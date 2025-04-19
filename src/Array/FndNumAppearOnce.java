package Array;

public class FndNumAppearOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,1,2,1,2};
		int n =arr.length;
		int res = getSingleElement(n,arr);
		System.out.println(res);
	}

	// xor will return the value as 1 only for the unique element
	private static int getSingleElement(int n,int[] arr) {
		int xor = 0;
		for(int a : arr) {
			xor = xor ^ a;
		}
		return xor;
	}
}
