
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 4, 7 };
		int target = 8;
		int first = 0;
		int last = nums.length - 1;
		int mid = first + last;
		while (first <= last) {
			if (nums[mid] == target) {
				System.out.println(mid);
			} else if (nums[mid] > target) {
				System.out.println(mid - 1);
			} else {
				System.out.println(mid + 1);
			}
			return;
		}
	}

}
