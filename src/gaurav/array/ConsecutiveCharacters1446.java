package gaurav.array;

public class ConsecutiveCharacters1446 {

	public static void main(String[] args) {
		System.out.println(maxPower("leeeetcode"));
	}
	
	public static int maxPower(String s) {
		int max = 1;
		int count = 1;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				count = 1;
			}
			max = Math.max(max, count);
		}

		return max;
	}
}
