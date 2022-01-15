package gaurav.array;

import java.util.Arrays;

public class TwoSumLessThanK1099 {
	public static void main(String[] args) {
		System.out.println(twoSumLessThanK(new int[] { 10, 20, 30 }, 35));
	}

	public static int twoSumLessThanK(int[] nums, int k) {

		Arrays.sort(nums);

		int i = 0;
		int j = nums.length - 1;
		int result = -1;

		while (i < j) {
			if (nums[i] + nums[j] >= k) {
				j--;
			} else if (nums[i] + nums[j] < k) {
				result = Math.max(result, nums[i] + nums[j]);
				i++;
			}
		}

		return result;
	}
}
