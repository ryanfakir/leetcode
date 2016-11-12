package leetcode_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pyan on 11/11/2016.
 */
public class LeetCode {
    public class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            if (nums.length == 0) {
                return res;
            }
            Arrays.sort(nums);
            for (int i = 0; i<nums.length-2; i++) {
                if (i != 0 && nums[i] == nums[i-1]) continue;
                int j = i+1;
                int right = nums.length-1;
                while (j< right) {
                    int sum = nums[i] + nums[right]+ nums[j];
                    if (sum < 0) {
                        j++;
                    } else if (sum > 0) {
                        right--;
                    } else {
                        List<Integer> cur = new ArrayList<>();
                        cur.add(nums[i]);
                        cur.add(nums[j]);
                        cur.add(nums[right]);
                        res.add(cur);
                        j++;
                        right--;
                        while (j < right && nums[j] == nums[j-1]) {
                            j++;
                        }
                        while (j < right && nums[right] == nums[right+1]) {
                            right--;
                        }
                    }
                }
            }
            return res;

        }
    }
}
