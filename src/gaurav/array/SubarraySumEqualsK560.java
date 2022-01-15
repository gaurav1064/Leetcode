package gaurav.array;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK560 {
	public static void main(String[] args) {
		System.out.println(subarraySum(new int[] {1,1,1}, 2));
	}

	public static int subarraySum(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int result = 0;
		int sum = 0;
		map.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (map.containsKey(sum - k)) {
				result += map.get(sum - k);
			}

			if (map.containsKey(sum)) {
				map.put(sum, map.get(sum) + 1);
			} else {
				map.put(sum, 1);
			}

		}
		return result;
	}
}
