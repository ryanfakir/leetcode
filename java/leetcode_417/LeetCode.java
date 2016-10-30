package leetcode_417;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyan on 10/29/2016.
 */
public class LeetCode {
    public class Solution {
        public List<int[]> pacificAtlantic(int[][] matrix) {
            List<int[]> res = new ArrayList<>();
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return res;
            }
            int row = matrix.length;
            int col = matrix[0].length;
            boolean[][] pVisited = new boolean[row][col];
            boolean[][] aVisited = new boolean[row][col];
            for (int i= 0; i<row; i++) {
                dfs(matrix, pVisited, Integer.MIN_VALUE, i, 0);
                dfs(matrix, aVisited, Integer.MIN_VALUE, i, col-1);
            }
            for (int i= 0; i<col; i++) {
                dfs(matrix, pVisited, Integer.MIN_VALUE, 0, i);
                dfs(matrix, aVisited, Integer.MIN_VALUE, row-1, i);
            }
            for (int i= 0; i<row; i++) {
                for (int j = 0; j< col; j++) {
                    if (aVisited[i][j] &&  pVisited[i][j]) {
                        int[] index = new int[2];
                        index[0] = i;
                        index[1] = j;
                        res.add(index);
                    }
                }
            }
            return res;
        }

        private void dfs(int[][] matrix, boolean[][] visited,int val, int i, int j) {
            if (i<0 || i>=matrix.length || j<0 || j>=matrix[0].length || visited[i][j] || matrix[i][j] < val) {
                return;
            }
            visited[i][j] = true;
            dfs(matrix, visited, matrix[i][j], i+1, j);
            dfs(matrix, visited, matrix[i][j], i-1, j);
            dfs(matrix, visited, matrix[i][j], i, j-1);
            dfs(matrix, visited, matrix[i][j], i, j+1);
        }
    }
}
