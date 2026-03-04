class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;

        for (int num: nums) {
            set.add(num);
        }

        for (int num: set) {
            if (!set.contains(num - 1)) {
                int currStreak = 1;
                int currNum = num;
                while(set.contains(currNum + 1)) {
                    currStreak++;
                    currNum++;
                }

                ans = Math.max(currStreak, ans);
                
            }
        }

        return ans;
    }
}