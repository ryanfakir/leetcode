package leetcode_350;

import java.util.Arrays;

/**
 * Created by pyan on 9/21/2016.
 */
class LeetCode {
    public class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            if (nums1 == null || nums2 == null) {
                return new int[0];
            }
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int len1 = nums1.length;
            int len2 = nums2.length;
            int resLen = len1 > len2 ? len2 : len1;
            int[] temp = new int[resLen];
            int i = 0;
            int j = 0;
            int index = 0;
            while (i < len1 && j < len2) {
                if (nums1[i] == nums2[j]) {
                    temp[index] = nums1[i];
                    index++;
                    i++;
                    j++;
                } else if (nums1[i] > nums2[j]) {
                    j++;
                } else {
                    i++;
                }
            }
            int[] res = new int[index];
            for (int k = 0 ; k< index; k++) {
                res[k] = temp[k];
            }
            return res;
        }
    }
}
