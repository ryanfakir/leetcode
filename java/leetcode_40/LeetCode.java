package leetcode_40;

import java.util.*;

/**
 * Created by pyan on 10/30/2016.
 */
public class LeetCode {
    public class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> cur = new ArrayList<>();
            Arrays.sort(candidates);
            dfs(res, cur, 0, target, 0, candidates);
            return res;
        }

        private void dfs(List<List<Integer>> res, List<Integer> cur, int level, int target, int sum, int[] candidates) {
            if (sum > target) {
                return;
            }
            if (sum == target) {
                res.add(new ArrayList<>(cur));
            }
            Set<Integer> s = new HashSet<>();
            for (int i=level;i<candidates.length; i++) {
                if (!s.contains(candidates[i])) {
                    s.add(candidates[i]);
                    cur.add(candidates[i]);
                    dfs(res, cur, i+1, target, sum+candidates[i], candidates);
                    cur.remove(cur.size()-1);
                }
            }
        }
    }
}
