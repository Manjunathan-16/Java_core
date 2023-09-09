package DailyCoding;

public class ConvertFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12106;
		int digit = 0;
		int power = 1;
		int temp = 0;
		while (n != 0) {
			digit = n % 10;
			if (digit == 0) {
				digit = 5;
			}
			temp += digit * power;
			n = n / 10;
			power = power * 10;		
		}
		System.out.println(temp);

	}

}
