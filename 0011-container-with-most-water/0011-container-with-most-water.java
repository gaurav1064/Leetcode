class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length - 1;
        int i = 0;

        while (i < n) {
            int width = n-i;
            int area = Math.min(height[i], height[n]) * width;
            max = Math.max(area, max);
            if (height[i] <= height[n]) i++;
            else n--;
        }

        return max;

        
    }
}