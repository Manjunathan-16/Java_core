import java.util.ArrayList;

public class MultiplyArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		int j=0;
		int n = arr.length;
		ArrayList<Integer> list = new ArrayList<>();
		while(j < n) {
			int a = 1;
			for(int i=0;i<n;i++) {
				a = a*arr[i];
			}
			a = a / arr[j];
			list.add(a);
			j++;
		}
		System.out.println(list);
	}

}
