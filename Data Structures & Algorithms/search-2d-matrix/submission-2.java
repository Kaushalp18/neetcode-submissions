class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int rows = matrix.length;
        int bottom = rows - 1;
        int columns = matrix[0].length;
        int right = columns - 1;

        int row = -1;
        for (int i = 0; i <= bottom; i++) {
            if (matrix[i][0] <= target && matrix[i][right] >= target) {
                row = i;
                break;
            }
        }

        if (row == -1)
            return false;

        int low = 0;
        int high = right;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}