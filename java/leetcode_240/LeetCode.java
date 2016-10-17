package leetcode_240;

/**
 * Created by pyan on 10/16/2016.
 */
class LeetCode {
    public class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 ){
                return false;
            }
            int lenX = matrix.length;
            int lenY = matrix[0].length;
            int i = lenX -1;
            int j = 0;
            while (i >= 0 && j < lenY) {
                if (matrix[i][j] > target) {
                    i--;
                } else if (matrix[i][j] < target) {
                    j++;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
