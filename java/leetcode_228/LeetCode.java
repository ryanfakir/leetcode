package leetcode_228;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyan on 11/5/2016.
 */
public class LeetCode {
    public class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> res = new ArrayList<>();
            if (nums == null || nums.length == 0) {
                return res;
            }
            int left = 0;
            for (int i = 0; i<nums.length; i++) {
                while (i+1 < nums.length && nums[i] == nums[i+1] -1) {
                    i++;
                }
                if (left != i) {
                    res.add(nums[left] + "->" + nums[i]);
                } else {
                    res.add("" + nums[left]);
                }
                left = i+1;
            }
            return res;
        }
    }
}
