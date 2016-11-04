package leetcode_373;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyan on 11/3/2016.
 */
public class LeetCode {
    public class Solution {
        public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
            if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
                return new ArrayList<>();
            }
            k = Math.min(k, nums1.length*nums2.length);
            int[] location = new int[nums2.length];
            List<int[]> res = new ArrayList<>();
            for (int i=0; i<k; i++) {
                int[] cur = new int[2];
                int sum = Integer.MAX_VALUE;
                for (int j =0; j<nums2.length; j++) {
                    if (location[j] < nums1.length) {
                        sum = Math.min(sum, nums1[location[j]] + nums2[j]);
                    }
                }
                for (int j=0; j<nums2.length; j++) {
                    if (location[j] < nums1.length) {
                        if (sum == nums1[location[j]] + nums2[j]) {
                            cur[0] = nums1[location[j]];
                            cur[1] = nums2[j];
                            res.add(cur);
                            location[j]++;
                            break;
                        }
                    }
                }
            }
            return res;
        }
    }
}
