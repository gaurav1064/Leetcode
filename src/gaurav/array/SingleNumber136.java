package gaurav.array;

public class SingleNumber136 {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1 };
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		int a = 0;
		for (int num : nums) {
			a ^= num;
		}

		return a;
	}
}
