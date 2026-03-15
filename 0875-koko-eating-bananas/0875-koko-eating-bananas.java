class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 1;

        for (int i = 0; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }

        int ans = Integer.MAX_VALUE;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if (getNumberOfHours(piles, mid) > h) {
                low = mid + 1;
            } else {
                ans = Math.min(ans, mid);
                high = mid - 1;
            }
        }

        return ans;

    }

    private int getNumberOfHours(int[] piles, int hours) {
        int result = 0;

        for (int pile : piles) {
            result += Math.ceil((double)pile / hours);
        }

        return result;
    }
}