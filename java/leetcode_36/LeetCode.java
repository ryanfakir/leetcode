package leetcode_36;

import java.util.Arrays;

/**
 * Created by pyan on 9/29/2016.
 */
class LeetCode {
    public class Solution {
        public boolean isValidSudoku(char[][] board) {

            for (int i = 0; i<9; i++) {
                boolean[] matrix = new boolean[10];
                Arrays.fill(matrix, false);
                for (int j = 0; j< 9; j++) {
                    if (!checker(matrix, board[i][j])) {
                        return false;
                    }
                }
            }

            for (int i= 0; i<9; i++) {
                boolean[] matrix = new boolean[10];
                Arrays.fill(matrix, false);
                for (int j = 0; j< 9 ; j++) {
                    if (!checker(matrix, board[j][i])) {
                        return false;
                    }
                }
            }

            for (int i = 0; i<9; i= i+3) {
                for (int j = 0; j<9; j = j+3) {
                    boolean[] matrix = new boolean[10];
                    Arrays.fill(matrix, false);
                    for (int k = 0 ; k<9 ; k++) {
                        if (!checker(matrix, board[i + k/3][j + k%3])) {
                            return false;
                        }
                    }
                }
            }

            return true;

        }

        private boolean checker(boolean[] matrix, char element) {
            if (element == '.') {
                return true;
            }
            int index = element - '0';
            if (matrix[index]) {
                return false;
            } else {
                matrix[index] = true;
            }
            return true;
        }
    }
}
