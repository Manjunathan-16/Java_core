package Array;

public class NumberApperOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  arr = {2,4,1,4,1};
		int n = arr.length;
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[arr[i]]++;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i] == 1) {
				System.out.println(i);
			}
		}
	}

}
