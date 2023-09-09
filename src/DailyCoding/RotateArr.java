package DailyCoding;

public class RotateArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 4, 2 };
		int n = arr.length;
		int d = 3;	
		int temp=0;
		for(int i=0;i<d;i++) {
			temp=arr[i];
			System.out.println(temp);
		}
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
			//System.out.println(temp);
		}
		for(int i=0;i<d;i++) {
			arr[n-d+i]=temp;
			System.out.println("main "+arr[i]);
		}
		
		
	}
}
