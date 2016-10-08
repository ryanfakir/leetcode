package leetcode_260;

/**
 * Created by pyan on 10/7/2016.
 */
class LeetCode {
    public class Solution {
        public int[] singleNumber(int[] nums) {
            int temp = 0;
            for (int i = 0; i< nums.length; i++) {
                temp ^= nums[i];
            }
            int lastBit = temp - (temp&(temp-1));
            int groupA = 0, groupB = 0;
            for (int i= 0; i<nums.length; i++) {
                if ((nums[i] & lastBit) == 0) {
                    groupA ^= nums[i];
                } else {
                    groupB ^= nums[i];
                }
            }
            int[] res = new int[2];
            res[0] = groupA;
            res[1] = groupB;
            return res;
        }
    }
}
