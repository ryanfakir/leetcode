package leetcode_73;

import java.util.Arrays;

/**
 * Created by pyan on 10/21/2016.
 */
public class LeetCode {
    public class Solution_mn {
        public void setZeroes(int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
            int[] arrRow = new int[row];
            int[] arrCol = new int[col];
            Arrays.fill(arrRow, -1);
            Arrays.fill(arrCol, -1);
            for (int i=0; i<row; i++) {
                for (int j = 0; j<col; j++) {
                    if (matrix[i][j] == 0) {
                        arrRow[i] = 0;
                        arrCol[j] = 0;
                    }
                }
            }
            for (int i =0; i<row; i++) {
                for (int j = 0; j<col; j++) {
                    if (arrRow[i] == 0 || arrCol[j] == 0) {
                        matrix[i][j] =0;
                    }
                }
            }
        }
    }

    public class Solution_inplace {
        public void setZeroes(int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
            boolean zeroRow = false;
            boolean zeroCol = false;
            for (int i = 0; i<row; i++) {
                if (matrix[i][0] == 0) {
                    zeroRow = true;
                }
            }
            for (int j = 0; j< col; j++) {
                if (matrix[0][j] == 0) {
                    zeroCol = true;
                }
            }
            for (int i = 1; i<row; i++) {
                for (int j = 1; j<col; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
            for (int i = 1; i<row; i++) {
                for (int j =1; j<col; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
            if (zeroRow) {
                for (int i = 0; i<row; i++) {
                    matrix[i][0] = 0;
                }
            }
            if (zeroCol) {
                for (int j =0; j<col; j++) {
                    matrix[0][j] = 0;
                }
            }
        }
    }
}
