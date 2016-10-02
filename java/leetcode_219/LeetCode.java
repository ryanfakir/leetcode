package leetcode_219;

import java.util.HashMap;

/**
 * Created by pyan on 10/1/2016.
 */
class LeetCode {
    public class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
            for (int i = 0; i<nums.length; i++) {
                if (dict.containsKey(nums[i])) {
                    if (i - dict.get(nums[i]) <= k ) {
                        return true;
                    }
                }
                dict.put(nums[i], i);
            }
            return false;
        }
    }
}
