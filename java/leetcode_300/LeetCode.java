package leetcode_300;

/**
 * Created by pyan on 10/16/2016.
 */
class LeetCode {
    public class Solution_n2 {
        public int lengthOfLIS(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int len = nums.length;
            int[] dp = new int[len];
            dp[0] = 0;
            int res = 0;
            for (int i = 1; i < len; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
                res = Math.max(res, dp[i]);
            }
            return res + 1;
        }

        public class Solution_nlogn {
            public int lengthOfLIS(int[] nums) {
                if (nums == null || nums.length == 0) {
                    return 0;
                }
                int len = nums.length;
                int[] q = new int[len];
                q[0] = nums[0];
                int res = 0;
                for (int i = 1; i < len; i++) {
                    int left = 0, right = res;
                    int pos = binary(left, right, q, nums[i]);
                    System.out.println(pos);
                    q[pos] = nums[i];
                    if (pos > res) {
                        res = pos;
                    }
                }
                return res + 1;
            }

            private int binary(int left, int right, int[] q, int val) {
                while (left + 1 < right) {
                    int mid = (right - left) / 2 + left;
                    if (q[mid] > val) {
                        right = mid;
                    } else if (q[mid] < val) {
                        left = mid;
                    } else {
                        return mid;
                    }
                }
                if (q[right] < val) {
                    return right + 1;
                }
                if (q[left] >= val) {
                    return left;
                }
                return right;
            }
        }
    }
}
