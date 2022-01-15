package gaurav.array;

public class FindEvenNosOfDigits1295 {

	public static void main(String[] args) {
		int[] nums = {3, 14, 234, 6544, 1234};
		System.out.println(findNumbers(nums));
	}

	public static int findNumbers(int[] nums) {
		int result = 0;
		for (int num : nums) {
			if (getNumberOfDigits(num) % 2 == 0)
				result++;
		}

		return result;
	}

	public static int getNumberOfDigits(int num) {
		int numberOfDigits = 0;

		while (num != 0) {
			num = num / 10;
			numberOfDigits++;
		}

		return numberOfDigits;
	}
}
