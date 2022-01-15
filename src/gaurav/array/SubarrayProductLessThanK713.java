package gaurav.array;

public class SubarrayProductLessThanK713 {

	public static void main(String[] args) {
		System.out.println(numSubarrayProductLessThanK(new int[] { 10, 5, 2, 6 }, 100));
	}

	public static int numSubarrayProductLessThanK(int[] nums, int k) {
		if (k <= 1)
			return 0;
		int left = 0;
		int right = 0;
		int prod = 1;
		int result = 0;
		while (right < nums.length) {
			prod *= nums[right];

			while (prod >= k) {
				prod = prod / nums[left];
				left++;
			}

			result += right - left + 1;
			right++;
		}

		return result;

	}
}
