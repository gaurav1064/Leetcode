package gaurav.array;

public class Concatenation1929 {

	public static void main(String[] args) {
		int[] input = {1, 2, 1};
		int[] output = getConcatenation(input);
		
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
		
	}

	public static int[] getConcatenation(int[] nums) {
		int[] ans = new int[nums.length * 2];

		for (int i = 0; i < 2 * nums.length; i++) {
			ans[i] = nums[i % nums.length];
		}

		return ans;
	}

}
