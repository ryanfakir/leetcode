package leetcode_376;

import java.util.Arrays;

/**
 * Created by pyan on 10/22/2016.
 */
public class LeetCode {
    public class Solution_DP {
        public int wiggleMaxLength(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int[] incre = new int[nums.length];
            int[] decre = new int[nums.length];
            Arrays.fill(incre, 1);
            Arrays.fill(decre, 1);
            for (int i = 1; i<nums.length; i++) {
                for (int j = 0; j<i; j++) {
                    if (nums[i] > nums[j]) {
                        incre[i] = Math.max(incre[i], decre[j]+1);
                    } else if (nums[i] < nums[j]) {
                        decre[i] = Math.max(decre[i], incre[j]+1);
                    }
                }
            }
            return Math.max(decre[nums.length-1], incre[nums.length-1]);
        }
    }

    public class Solution_greedy {
        public int wiggleMaxLength(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int j = 0;
            int res = 1;
            for (int i=1; i<nums.length;j=i, i++) {
                if (nums[j] < nums[i]) {
                    res++;
                    while(i+1 < nums.length && nums[i] <= nums[i+1]) {
                        i++;
                    }
                } else if (nums[j] > nums[i]) {
                    res++;
                    while (i+1< nums.length && nums[i] >= nums[i+1]) {
                        i++;
                    }
                }
            }
            return res;
        }
    }
}
