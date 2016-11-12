package leetcode_304;

/**
 * Created by pyan on 11/11/2016.
 */
public class LeetCode {
    public class NumMatrix {
        private int[][] dp;

        public NumMatrix(int[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return;
            }
            int row = matrix.length, col = matrix[0].length;
            this.dp = new int[row + 1][col + 1];
            for (int i = 1; i <= matrix.length; i++) {
                for (int j = 1; j <= matrix[0].length; j++) {
                    this.dp[i][j] = dp[i - 1][j]
                            + dp[i][j - 1]
                            - dp[i - 1][j - 1]
                            + matrix[i - 1][j - 1];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return dp[row2 + 1][col2 + 1] + dp[row1][col1] - dp[row1][col2 + 1] - dp[row2 + 1][col1];
        }
    }
}
