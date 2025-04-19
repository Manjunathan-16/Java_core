package InterviewQuestions;

public class WissenCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 2, 3, 4, 4, 5, 6, 7, 8 };

		// Swap adjacent even and odd numbers
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i+1] % 2 == 0) {
				// Swap the elements
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			} else {
				array[i] = array[i];
			}
		}

		// Print the array
		for (int i : array) {
			System.out.print(i + " ");
		}

	}

}
