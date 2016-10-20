package leetcode_74;

/**
 * Created by pyan on 10/19/2016.
 */
public class LeetCode {
    public class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0) {
                return false;
            }
            int row = matrix.length-1, col = matrix[0].length-1;
            int left = 0, right = (row + 1) *(col + 1) -1;
            while (left + 1 < right) {
                int mid = (right - left)/2 + left;
                if (matrix[mid/(col+1)][mid%(col+1)] < target) {
                    left = mid;
                } else if (matrix[mid/(col+1)][mid%(col+1)] > target) {
                    right = mid;
                } else {
                    return true;
                }
            }
            if (matrix[left/(col+1)][left%(col+1)] == target || matrix[right/(col+1)][right%(col+1)] == target  ) {
                return true;
            }
            return false;
        }
    }
}
