package leetcode_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pyan on 11/8/2016.
 */
public class LeetCode {
    public class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i< nums.length-3; i++) {
                if (i != 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                for (int j = i+1; j<nums.length-2; j++) {
                    if (j != i+1 && nums[j] == nums[j - 1]) {
                        continue;
                    }
                    int left = j+1, right = nums.length-1;
                    while (left < right) {
                        int sum = nums[i] + nums[j] + nums[left] + nums[right];
                        if (sum > target) {
                            right--;
                        } else if (sum < target) {
                            left++;
                        } else {
                            ArrayList<Integer> tmp = new ArrayList<Integer>();
                            tmp.add(nums[i]);
                            tmp.add(nums[j]);
                            tmp.add(nums[left]);
                            tmp.add(nums[right]);
                            res.add(tmp);
                            right--;
                            left++;
                            while (left < right && nums[left] == nums[left - 1]) {
                                left++;
                            }
                            while (left < right && nums[right] == nums[right + 1]) {
                                right--;
                            }
                        }
                    }
                }
            }
            return res;
        }
    }
}
