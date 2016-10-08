package leetcode_167;

/**
 * Created by pyan on 10/7/2016.
 */
class LeetCode {
    public class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int left = 0;
            int right = numbers.length -1;
            while (left < right) {
                if (numbers[left] + numbers[right] > target) {
                    right--;
                } else if (numbers[left] + numbers[right] < target) {
                    left++;
                } else {
                    int[] res = new int[2];
                    res[0] = left +1;
                    res[1] = right +1;
                    return res;
                }
            }
            return new int[2];
        }
    }
}
