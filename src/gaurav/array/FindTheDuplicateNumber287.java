package gaurav.array;

public class FindTheDuplicateNumber287 {

	public static void main(String[] args) {
		int[] nums = { 1, 4, 3, 3, 2, 2 };
		System.out.println(findDuplicate(nums));
	}

	public static int findDuplicate(int[] nums) {
		int slow = nums[0];
		int fast = nums[0];
		int n = nums.length;

		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while (slow != fast);

		slow = nums[0];

		while (slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}

		return slow;
	}
}
