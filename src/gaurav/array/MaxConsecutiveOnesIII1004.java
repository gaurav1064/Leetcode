package gaurav.array;

public class MaxConsecutiveOnesIII1004 {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		int k = 2;

		System.out.println(longestOnes(nums, k));
	}

	public static int longestOnes(int[] nums, int k) {
		int count = 0;
		int j = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				count++;

			while (count > k) {
				if (nums[j++] == 0)
					count--;
			}

			max = Math.max(max, i - j + 1);

		}

		return max;
	}
}
