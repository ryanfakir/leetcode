package leetcode_46;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyan on 10/12/2016.
 */
class LeetCode {
    public class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> cur = new ArrayList<Integer>();
            boolean[] visited = new boolean[nums.length];
            dfs(res, cur, visited, nums);
            return res;
        }

        private void dfs(List<List<Integer>> res, List<Integer> cur, boolean[] visited, int[] nums) {
            if (cur.size() == visited.length ) {
                res.add(new ArrayList(cur));
                return;
            }
            for (int i =0; i<nums.length; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    cur.add(nums[i]);
                    dfs(res, cur, visited, nums);
                    cur.remove(cur.size()-1);
                    visited[i] = false;
                }
            }
        }
    }
}
