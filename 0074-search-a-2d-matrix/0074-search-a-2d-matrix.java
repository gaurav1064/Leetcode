class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int size = matrix.length;
        int col = matrix[0].length;
        for (int row = 0; row < size; row++) {
            if (matrix[row][0] <= target && matrix[row][col-1] >= target) {
                return isPresent(matrix, row, target);
            }
        }

        return false;
    }


    private boolean isPresent(int[][] matrix, int row, int target) {
        int low = 0;
        int high = matrix[0].length;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[row][mid] == target) return true;

            if (matrix[row][mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;

    }
}