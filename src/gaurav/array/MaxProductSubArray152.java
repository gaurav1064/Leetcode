package gaurav.array;

public class MaxProductSubArray152 {
	public static void main(String[] args) {
		System.out.println(maxProduct(new int[] { 2, 0, -2, 4 }));
	}

	public static int maxProduct(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		int res = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int curr = nums[i];

			if (curr < 0) {
				int t = max;
				max = min;
				min = t;
			}

			max = Math.max(curr, curr * max);
			min = Math.min(curr, curr * min);

			res = Math.max(max, res);
		}

		return res;
	}
}
