package leetcode_48;

/**
 * Created by pyan on 10/18/2016.
 */
public class LeetCode {
    public class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i<n/2; i++) {
                for (int j = i; j+i<n-1; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n-1-j][i];
                    matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                    matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                    matrix[j][n-1-i] = temp;
                }
            }
        }
    }
}
