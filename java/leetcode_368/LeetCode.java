package leetcode_368;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pyan on 10/26/2016.
 */
public class LeetCode {
    public class Solution {
        public List<Integer> largestDivisibleSubset(int[] nums) {
            if (nums == null || nums.length == 0) {
                return new ArrayList<>();
            }
            Arrays.sort(nums);
            int[] dp = new int[nums.length];
            int[] backtrack = new int[nums.length];
            List<Integer> res = new ArrayList<>();
            Arrays.fill(dp, 1);
            for (int i= 0; i<nums.length; i++) {
                int localMax = 0;
                backtrack[i] = i;
                for (int j =0; j<i; j++) {
                    if (nums[i] % nums[j] == 0 && dp[i] < dp[j] +1) {
                        backtrack[i] = j;
                        localMax = Math.max(localMax, dp[j] +1);
                        dp[i] = localMax;
                    }
                }
            }
            int maxLen = 1;
            int maxIndex = 0;
            for (int i =0; i<nums.length; i++) {
                if (dp[i] > maxLen) {
                    maxLen = dp[i];
                    maxIndex = i;
                }
            }
            while (maxIndex != backtrack[maxIndex]) {
                res.add(nums[maxIndex]);
                maxIndex = backtrack[maxIndex];
            }
            res.add(nums[maxIndex]);
            // Collections.reverse(res);
            return res;
        }
    }
}
