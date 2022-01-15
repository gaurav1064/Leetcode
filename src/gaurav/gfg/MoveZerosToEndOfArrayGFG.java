package gaurav.gfg;

public class MoveZerosToEndOfArrayGFG {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 0, 5, 0, 3 };
		moveZerosToEndOfArray(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "");
		}
	}

	public static void moveZerosToEndOfArray(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.println(j);
			if (nums[i] != 0) {
				nums[j++] = nums[i];
			}
		}
		while (j < nums.length) {
			nums[j++] = 0;
		}
	}
}
