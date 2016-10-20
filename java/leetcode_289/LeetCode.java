package leetcode_289;

/**
 * Created by pyan on 10/19/2016.
 */
class LeetCode {
    public class Solution {
        public void gameOfLife(int[][] board) {
            int row = board.length;
            int col = board[0].length;
            for (int i = 0; i<row; i++) {
                for (int j = 0; j<col; j++) {
                    int number = getCount(board, i, j);
                    if (board[i][j] ==1) {
                        if (number == 2 || number == 3) {
                            board[i][j] = 3;
                        }
                    } else {
                        if (number == 3) {
                            board[i][j] = 2;
                        }
                    }

                }
            }

            for (int i=0; i<row; i++) {
                for (int j = 0; j<col; j++) {
                    board[i][j] >>=1;
                }
            }
        }

        private int getCount(int[][] board, int row, int col) {
            int cnt = 0;
            for (int i = row-1; i <= row +1; i++ ) {
                for (int j = col-1; j<= col +1; j++) {
                    if (i >=0 && i<board.length&&j >= 0&&j<board[0].length) {
                        cnt += board[i][j]&1;
                    }
                }
            }
            cnt-= board[row][col]&1;
            return cnt;
        }
    }
}
