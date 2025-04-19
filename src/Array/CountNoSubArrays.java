package Array;

public class CountNoSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0,1,0,1};
		int goal = 2;
		int n = nums.length;
		int count = 0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum += nums[j];
				if(sum == goal) {
					System.out.println("inside");
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
