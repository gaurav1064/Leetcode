class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;

        for (int num: nums) {
            if (num == 1) count++;
            else if (num == 0) count = 0;
            result = Math.max(count, result);
        }

        return result;
    }
}