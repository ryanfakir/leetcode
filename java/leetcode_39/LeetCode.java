package leetcode_39;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyan on 10/22/2016.
 */
public class LeetCode {
    public class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> cur = new ArrayList<>();
            dfs(res, cur, 0, target, candidates, 0);
            return res;
        }

        private void dfs(List<List<Integer>> res, List<Integer> cur, int level, int target, int[] candidates, int sum) {
            if (sum == target) {
                res.add(new ArrayList<>(cur));
                return;
            } else if (sum > target) {
                return;
            }
            for (int i = level; i<candidates.length; i++) {
                cur.add(candidates[i]);
                sum += candidates[i];
                dfs(res, cur, i, target, candidates, sum);
                sum -= candidates[i];
                cur.remove(cur.size() -1);
            }
        }
    }
}
