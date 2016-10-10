package leetcode_318;

/**
 * Created by pyan on 10/9/2016.
 */
class LeetCode {
    public class Solution {
        public int maxProduct(String[] words) {
            int[] arr = new int[words.length];
            for (int i = 0; i<words.length; i++) {
                arr[i] = 0;
                for (int j = 0; j<words[i].length(); j++) {
                    arr[i] |= 1<<words[i].charAt(j)-'a';
                }
            }
            int max = 0;
            for (int i = 0; i<words.length; i++) {
                for (int j = i+1; j<words.length; j++) {
                    if ((arr[i]&arr[j]) == 0) {
                        max = Math.max(max, words[i].length()*words[j].length());
                    }
                }
            }
            return max;
        }
    }
}
