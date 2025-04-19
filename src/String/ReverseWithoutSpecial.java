package String;

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
			}
			// Move the right pointer if not a letter
			else if (!Character.isLetter(arr[right])) {
				right--;
			}
			// Swap the letters if both pointers point to letters
			else {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

		// Convert char array back to string and return
		return new String(arr);
	}
}