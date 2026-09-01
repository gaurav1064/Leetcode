class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int postiveIndex = 0;
        int negativeIndex = 1;

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                // negative
                res[negativeIndex] = nums[i];
                negativeIndex= negativeIndex + 2;
            } else {
                res[postiveIndex] = nums[i];
                postiveIndex = postiveIndex + 2;
            }
        }

        return res;
    }
}