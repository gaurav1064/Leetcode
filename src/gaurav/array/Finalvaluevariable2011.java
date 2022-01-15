package gaurav.array;

public class Finalvaluevariable2011 {
	public static void main(String[] args) {
		String[] input = { "X++", "X++", "X++" };
		System.out.println(finalValueAfterOperations(input));
	}

	public static int finalValueAfterOperations(String[] operations) {
		int result = 0;
		for (int i = 0; i < operations.length; i++) {
			if (operations[i].contains("++")) {
				result++;
			} else if (operations[i].contains("--")) {
				result--;
			}
		}

		return result;
	}

}
