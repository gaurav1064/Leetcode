package gaurav.array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals56 {

	public static void main(String[] args) {
		int[][] input = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

		int[][] output = merge(input);

		for (int i = 0; i < output.length; i++) {

			System.out.println(output[i][0] + " " + output[i][1]);

		}
	}

	public static int[][] merge(int[][] intervals) {
		List<int[]> result = new ArrayList<>();

		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

		int start = intervals[0][0];
		int end = intervals[0][1];

		for (int[] interval : intervals) {
			if (end >= interval[0]) {
				end = Math.max(end, interval[1]);
			} else {
				result.add(new int[] { start, end });
				start = interval[0];
				end = interval[1];
			}
		}
		result.add(new int[] { start, end });

		return result.toArray(new int[result.size()][]);
	}
}
