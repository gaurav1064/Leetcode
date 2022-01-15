package gaurav.array;

public class MaxSubarray53 {

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] { -2, 1 }));
	}

	public static int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		int curr = 0;

		for (int i = 0; i < nums.length; i++) {
			curr = curr + nums[i];

			if (curr > max)
				max = curr;

			if (curr < 0)
				curr = 0;

		}
		return max;
	}
}
