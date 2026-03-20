class Solution {
    public int splitArray(int[] nums, int k) {
        int low = getMax(nums);
        int high = getSum(nums);

        int ans = 0;

        while(low <= high) {
            int mid = low + (high - low)/2;

            int splits = getNumberOfSplits(nums, mid, k);

            if (splits > k) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;
    }

    private int getNumberOfSplits(int[] nums, int maxSum, int k) {
        int currSum = 0;
        int split = 1;

        for (int i = 0; i < nums.length; i++) {
            if (currSum + nums[i] > maxSum) {
                split++;
                currSum = nums[i];
            } else {
                currSum += nums[i];
            }
        }

        return split;
    }

    private int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int num: nums) {
            max = Math.max(max, num);
        }

        return max;
    }

    private int getSum(int[] nums) {
        int sum = 0;

        for (int num: nums) {
           sum += num;
        }

        return sum;
    }
}