public class SortingArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int arr[] = { 78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
//			System.out.print(" ");
//			System.out.print(arr[i]);

		}
		String s = "Manju" ; 
		
		s = "nath";
		
		System.out.println(s);
	}
}
