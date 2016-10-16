package leetcode_77;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyan on 10/15/2016.
 */
public class LeetCode {
    public class Solution {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> cur = new ArrayList<>();
            dfs(res, cur,1, k, n);
            return res;
        }

        private void dfs(List<List<Integer>> res, List<Integer> cur, int level, int k, int n) {
            if (cur.size() == k) {
                res.add(new ArrayList<>(cur));
                return;
            }
            for (int i=level; i<=n; i++) {
                cur.add(i);
                dfs(res,cur,i+1, k, n);
                cur.remove(cur.size()-1);
            }
        }
    }
}
