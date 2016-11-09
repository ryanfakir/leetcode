package leetcode_79;

/**
 * Created by pyan on 11/8/2016.
 */
public class LeetCode {
    public class Solution {
        public boolean exist(char[][] board, String word) {
            if (board == null || board.length == 0 || board[0].length == 0) {
                return false;
            }
            int row = board.length;
            int col = board[0].length;
            boolean[][] visited = new boolean[row][col];
            for (int i =0; i<row; i++) {
                for (int j = 0; j< col; j++) {
                    if (dfs(board, word, 0, i, j, visited)) {
                        return true;
                    }
                }
            }
            return false;
        }


        private boolean dfs(char[][] board, String word, int level, int i, int j, boolean[][] visited) {
            if (level == word.length()) {
                return true;
            }
            if (i<0 || i >= board.length || j <0 || j>=board[0].length || visited[i][j]) {
                return false;
            }
            if (word.charAt(level) == board[i][j]) {
                visited[i][j] = true;
                boolean res = dfs(board, word, level+1, i-1, j, visited) || dfs(board, word, level+1, i+1, j, visited) ||dfs(board, word, level+1, i, j-1, visited) ||dfs(board, word, level+1, i, j+1, visited);
                visited[i][j] = false;
                return res;
            }
            return false;
        }
    }
}
