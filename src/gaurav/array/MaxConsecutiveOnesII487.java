package gaurav.array;

public class MaxConsecutiveOnesII487 {
	public static void main(String[] args) {
		int[] nums = { 1, 0, 1, 1, 0, 1 };
		System.out.println(findMaxConsecutiveOnes(nums));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int j = 0;
		int count = 0;
		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				count++;

			while (count > 1) {
				// j++;
				if (nums[j++] == 0)
					count--;
			}

			max = Math.max(max, i - j + 1);

		}

		return max;
	}
}
