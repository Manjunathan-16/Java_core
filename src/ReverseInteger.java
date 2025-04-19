
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 =321;
		int x = 120;
		int res = 0 ;
		double value = Math.pow(2, 31);
		System.out.println(value);
		while(x < 0 || x >0) {
			int rem = x%10;
			res = res*10+rem;
			x=x/10;
		}
		System.out.println(res);
		
		long testValue = 2147483648L;
		
		if(testValue < Integer.MIN_VALUE || testValue > Integer.MAX_VALUE) {
			System.out.println("0");
			
		}
	}
}
