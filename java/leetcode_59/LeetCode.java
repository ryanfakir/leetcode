package leetcode_59;

/**
 * Created by pyan on 10/16/2016.
 */
public class LeetCode {
    public class Solution {
        public int[][] generateMatrix(int n) {
            int[][] res = new int[n][n];
            if (n== 0) {
                return res;
            }
            int num = 1;
            int startX = 0;
            int startY = 0;
            while (startX <= n) {
                int i = startX;
                int j = startY;
                for (; j<n; j++) {
                    res[i][j] = num++;
                }
                j--;
                i++;
                for (; i<n; i++) {
                    res[i][j] = num++;
                }
                i--;
                j--;
                for (; j>=startY;j--) {
                    res[i][j] = num++;
                }
                j++;
                i--;
                for (;i>startX;i--) {
                    res[i][j] = num++;
                }
                startX++;
                startY++;
                n--;
            }
            return res;
        }
    }
}
