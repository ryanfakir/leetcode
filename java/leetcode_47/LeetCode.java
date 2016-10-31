package leetcode_47;

import java.util.*;

/**
 * Created by pyan on 10/30/2016.
 */
public class LeetCode {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        dfs(res, cur, nums, visited);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> cur, int[] nums, boolean[] visited) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!s.contains(nums[i]) && !visited[i]) {
                s.add(nums[i]);
                visited[i] = true;
                cur.add(nums[i]);
                dfs(res, cur, nums, visited);
                cur.remove(cur.size() - 1);
                visited[i] = false;
            }
        }
    }
}

