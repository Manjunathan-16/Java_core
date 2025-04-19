package Hashing;

public class CountingFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		int[] arr = { 10, 5, 10, 15, 10, 5 };
		for (int i = 0; i < arr.length; i++) {
			for(int j =i+1 ;j<arr.length;j++){
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			System.out.println(arr[i] +" "+ count);
		}

	}

}
