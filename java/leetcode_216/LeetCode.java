package leetcode_216;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyan on 10/11/2016.
 */
class LeetCode {
    public class Solution {
        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            List<Integer> cur = new ArrayList<>();
            dfs(res, cur, 1, k, n);
            return res;
        }

        private void dfs(List<List<Integer>> res, List<Integer> cur, int level, int k, int sum) {
            if (sum < 0) {
                return;
            }
            if (cur.size() == k && sum == 0) {
                res.add(new ArrayList<Integer>(cur));
                return;
            }
            for (int i = level; i<=9; i++) {
                cur.add(i);
                dfs(res, cur, i+1, k, sum-i);
                cur.remove(cur.size()-1);
            }
        }
    }
}
