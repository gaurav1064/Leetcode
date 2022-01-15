package gaurav.array;

public class MaxConsecutiveOnes485 {

	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 1, 1, 1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		int ones = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				ones++;
				max = Math.max(max, ones);
			} else {
				ones = 0;
			}
		}

		return max;
	}
}
