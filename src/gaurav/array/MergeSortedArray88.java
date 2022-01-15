package gaurav.array;

public class MergeSortedArray88 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };

		merge(nums1, 3, nums2, 3);
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;

		for (int p = m + n - 1; p >= 0; p--) {
			if (j < 0)
				return;
			if (i >= 0 && nums1[i] > nums2[j]) {
				nums1[p] = nums1[i--];
			} else {
				nums1[p] = nums2[j--];
			}
		}
	}
}
