package Array;
import java.util.Arrays;

public class pushZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,5,3,0,4};
		int n=arr.length;
		int count =0;
		int last = n-1;
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				a[count] = arr[i];
				count++;
			}else {
				a[last] = arr[i];
				last--;
			}
		}
		for(int i=0;i<n;i++) {
			arr[i] = a[i];
		}
		System.out.println(Arrays.toString(arr));
		anotherWay(arr,n);
	}
	
	public static void anotherWay(int[] arr, int n) {
		int i =0 ;
		int[] a = new int[n];
		for(int j=0;j<n;j++) {
			if(arr[j] > 0) {
				a[i] = arr[j];
				i++;
			}
		}
		
		for(int j=i;j<n;j++) {
			a[j] = 0;
		}
		System.out.println("Another way - "+Arrays.toString(a));
	}
}