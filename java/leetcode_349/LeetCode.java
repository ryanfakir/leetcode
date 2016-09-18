package leetcode_349;

import java.util.Arrays;

/**
 * Created by pyan on 9/18/2016.
 */
class LeetCode {
    public class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
                return new int[0];
            }
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int num1Len = nums1.length;
            int num2Len = nums2.length;
            int sLen = num1Len > num2Len ? num2Len : num1Len;
            int[] temp = new int[sLen];
            int index = 0, i = 0, j = 0;
            while (i < num1Len && j < num2Len) {
                if (nums1[i] == nums2[j]) {
                    // two nums same
                    if (i == 0 || nums1[i - 1] != nums1[i]) {
                        temp[index++] = nums1[i];
                    }
                    i++;
                    j++;
                } else if (nums1[i] > nums2[j]) {
                    j++;
                } else {
                    i++;
                }
            }
            // populate result
            int[] res = new int[index];
            for (i = 0; i < index; i++) {
                res[i] = temp[i];
            }
            return res;
        }
    }
}
