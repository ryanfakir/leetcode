package leetcode_217;

import java.util.HashMap;

/**
 * Created by pyan on 9/20/2016.
 */
class LeetCode {
    public class Solution {
        public boolean containsDuplicate(int[] nums) {
            if (nums == null) {
                return false;
            }
            HashMap<Integer, Integer> hm = new HashMap();
            boolean res = false;
            for (int i = 0; i<nums.length; i++) {
                if (hm.containsKey(nums[i])) {
                    res = true;
                } else {
                    hm.put(nums[i], 0);
                }
            }
            return res;
        }
    }
}
