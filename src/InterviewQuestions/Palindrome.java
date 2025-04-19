package InterviewQuestions;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 1218;
		int temp = input, sum = 0, digit = 0;
		
		while (input > 0) {
			digit = input % 10;
			sum = sum * 10 + digit;
			input = input / 10;
		}
		
		if (sum == temp) {
			System.out.println("Entered number is a palindrome " + temp);
		} else {
			System.out.println("Entered number is not a palindrome " + temp);
		}

	}

}
