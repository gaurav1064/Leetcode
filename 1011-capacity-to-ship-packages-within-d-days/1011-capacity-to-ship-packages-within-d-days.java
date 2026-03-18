class Solution {

    private int getMax(int[] nums) {
        int min = Integer.MIN_VALUE;

        for (int num: nums) {
            min = Math.max(min, num);
        }

        return min;
    }

    private int getSum(int[] nums) {
        int sum = 0;

        for (int num: nums) {
           sum += num;
        }

        return sum;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = getMax(weights);
        int high = getSum(weights);
        int ans = 0;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            int noOfDays = getNoOfDays(weights, mid);

            if (noOfDays > days) {
               low = mid + 1;
            } else {
                ans = mid;
                high = mid -1;
            }
        }
        return ans;
    }

    private int getNoOfDays(int[] weights, int maxWeight) {
        int noOfDays = 1;
        int currSum = 0;

        for (int weight : weights) {
            if (currSum + weight > maxWeight) { 
                noOfDays++;
                currSum = 0;
            }
            currSum += weight;
        }

        return noOfDays;
    }
}