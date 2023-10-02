package DailyCoding;

import java.util.Arrays;

public class MaxChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "a";

//		int n = line.length();
//		if(n==1) {
//			System.out.println(line);
//			
//		}
//		char temp[] = line.toCharArray();
//		Arrays.sort(temp);
//		//System.out.println(temp);
//		outerloop:
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (temp[i] == temp[j]) {
//					System.out.println(temp[i]);
//					break outerloop;
//				}
//			}
//		}
		System.out.println(getMaxOccuringChar(line));
	}

	public static char getMaxOccuringChar(String line) {
		// Your code here
		char ans = '1';
		int n = line.length();
		System.out.println("value" + n);
		while (n <= 1) {
			ans = line.charAt(n);
			System.out.println("ans " + ans);
			return ans;
		}
		char arr[] = line.toCharArray();
		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("nn" + arr[i]);
					return arr[i];
				}
			}
		}
		System.out.println("iiii" + ans);
		return ans;
	}
}
