package Array;

public class CountNiceSubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 1, 2, 1, 1};
		int k = 3;
		int n=nums.length;
		int count=0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum +=nums[j]%2;
				if(sum == k) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
