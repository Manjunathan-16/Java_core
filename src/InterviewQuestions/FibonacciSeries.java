package InterviewQuestions;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		if(n<=1) {
			System.out.println(1);
			System.exit(0);
		}
		int[] a =new int[n+1];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<=n;i++) {
			a[i]= a[i-1]+a[i-2];
		}
		System.out.println(a[n]);
	}

}
