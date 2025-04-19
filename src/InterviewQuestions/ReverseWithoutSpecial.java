package InterviewQuestions;

import java.util.Arrays;

public class ReverseWithoutSpecial {
	public static void main(String[] args) {
		String reverse = "Ab,c,de!$";
		System.out.println(reverseWithoutSpecialChars(reverse));
	}

	public static String reverseWithoutSpecialChars(String str) {
		// Convert the string to a char array
		char[] arr = str.toCharArray();

		// Initialize two pointers
		int left = 0, right = arr.length - 1;

		// Traverse the string from both ends
		while (left < right) {
			// Move the left pointer if not a letter
			if (!Character.isLetter(arr[left])) {
				left++;
				System.out.println("left:"+left);
			}
			// Move the right pointer if not a letter
			else if (!Character.isLetter(arr[right])) {
				right--;
				System.out.println("right:"+right);
			}
			// Swap the letters if both pointers point to letters
			else {
				char temp = arr[left];
				arr[left] = arr[right];
				System.out.println("arr 31 : "+arr[right]);
				arr[right] = temp;
				left++;
				right--;
				System.out.println(temp+":"+arr[left]);
			}
		}

		// Convert char array back to string and return
		System.out.println(Arrays.toString(arr));
		System.out.println("42:"+new String(arr));
		return new String(arr);
	}
}