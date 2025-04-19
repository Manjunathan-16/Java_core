package InterviewQuestions;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int ans = prNum(n);
		if (ans == 1) {
			System.out.println("Prime number" );
		} else {
			System.out.println(" Not a Prime number ");
		}
	}

	public static int prNum(int n) {
		if (n == 1) {
			return 0;
		}
//		System.out.println(n/2);
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		
		return 1;
	}

}
