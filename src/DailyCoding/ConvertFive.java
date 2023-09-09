package DailyCoding;

public class ConvertFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 1005;
while(n!=0) {
	int digit =n%10;
	if(digit == 0) {
		digit = 5;
	}
	System.out.println(digit);
	break;
}

	}

}
