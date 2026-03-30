class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int col = 0;

        while(row >= 0 && col < matrix[0].length) {
            int number = matrix[row][col];

            if (number == target) return true;

            if (number < target) {
                col++;
            } else {
                row--;
            }
        }

        return false;

    }
}