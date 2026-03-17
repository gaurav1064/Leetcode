class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = getMax(nums);
        int ans = 0;

        while(low <= high) {
            int mid = low + (high - low)/2;
            int sum = sumOfD(nums, mid);
            if (sum > threshold) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;
    }

    private int sumOfD(int[] nums, int div) {
        int num = 0;

        for (int i = 0; i < nums.length; i++) {
            num += Math.ceil((double)(nums[i]) / (double) div);
        }

        return num;
    }

    private int getMax(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        return max;
    }

}