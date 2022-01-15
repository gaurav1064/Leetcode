package gaurav.array;

public class RunningSum1480 {
	public static void main(String[] args) {
		int[] input = { 1, 2, 1 };
		int[] output = runningSum(input);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}

	}

	public static int[] runningSum(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i - 1] + nums[i];
		}

		return nums;
	}
}
