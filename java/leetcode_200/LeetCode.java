package leetcode_200;

/**
 * Created by pyan on 10/28/2016.
 */
class LeetCode {
    public class Solution {
        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0|| grid[0].length == 0) {
                return 0;
            }
            int row = grid.length;
            int col = grid[0].length;
            boolean[][] visited = new boolean[row][col];
            int res = 0;
            for (int i=0; i<row; i++) {
                for (int j=0; j<col; j++) {
                    if (!visited[i][j] && grid[i][j] == '1') {
                        res++;
                        dfs(grid, visited, i, j);
                    }
                }
            }
            return res;
        }

        private void dfs(char[][] grid, boolean[][] visited, int i, int j) {
            if (i<0 || i>=grid.length || j <0 || j>=grid[0].length) {
                return;
            }
            if (!visited[i][j] && grid[i][j] == '1') {
                visited[i][j] = true;
                dfs(grid, visited, i+1, j);
                dfs(grid, visited, i-1, j);
                dfs(grid, visited, i, j-1);
                dfs(grid, visited, i, j+1);
            }
        }
    }
}
