
public class SearchInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 5, 6 };
		int left = 0;
		int right = nums.length - 1;
		int target = 7;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			System.out.println("mid"+ mid);
			if (nums[mid] == target) {
				System.out.println(mid);
			} else if (nums[mid] < target) {
				left = mid + 1;
				System.out.println("left" + left);
			} else {
				right = mid - 1;
				System.out.println("right " + right);
			}
		}
		System.out.println(left);
	}
}
