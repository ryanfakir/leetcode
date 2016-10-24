package leetcode_90;

import java.util.*;

/**
 * Created by pyan on 10/23/2016.
 */
public class LeetCode {
    public class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> cur = new ArrayList<>();
            Arrays.sort(nums);
            dfs(res, cur, 0, nums);
            return res;
        }

        private void dfs(List<List<Integer>> res, List<Integer> cur, int level, int[] nums) {
            res.add(new ArrayList<Integer>(cur));
            Set<Integer> pool = new HashSet<Integer>();
            for (int i = level; i<nums.length; i++) {
                if (!pool.contains(nums[i])) {
                    pool.add(nums[i]);
                    cur.add(nums[i]);
                    dfs(res, cur, i+1, nums);
                    cur.remove(cur.size()-1);
                }
            }
        }
    }
}
