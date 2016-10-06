package leetcode_1;

import java.util.HashMap;

/**
 * Created by pyan on 10/5/2016.
 */
class LeetCode {
    public class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                if (hm.containsKey(nums[i])) {
                    int[] res = {hm.get(nums[i]), i};
                    return res;
                } else {
                    hm.put(target-nums[i], i);
                }
            }
            return new int[]{0, 0};
        }
    }
}
