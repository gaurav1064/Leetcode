package gaurav.array;

public class SquaresOfSortedArray977 {

	public static void main(String[] args) {
		int[] arr = { -4, -1, 0, 3, 10 };
		int[] result = sortedSquares(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static int[] sortedSquares(int[] nums) {
		int i = 0;
		int j = nums.length - 1;
		int index = nums.length - 1;
		int[] result = new int[nums.length];

		while (i <= j) {
			if (Math.abs(nums[i]) > Math.abs(nums[j])) {
				result[index--] = nums[i] * nums[i];
				i++;
			} else {
				result[index--] = nums[j] * nums[j];
				j--;
			}
		}

		return result;

	}
}
