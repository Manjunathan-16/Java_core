package InterviewQuestions;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		int res = fact(n);
		System.out.println(res);
	}
	
	public static int fact(int n) {
		int ans = 1 ;
		for(int i=1;i<=n;i++) {
			ans = ans * i;
		}
		return ans;
	}

}
