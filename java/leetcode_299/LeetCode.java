package leetcode_299;

/**
 * Created by pyan on 9/30/2016.
 */
class LeetCode {
    public class Solution {
        public String getHint(String secret, String guess) {
            int a = 0;
            int b = 0;
            int[] dict = new int[10];
            for (int i = 0; i<secret.length(); i++) {
                if (secret.charAt(i) == guess.charAt(i)) {
                    a++;
                }
                dict[secret.charAt(i)-'0']++;
            }
            for (int i = 0; i<guess.length(); i++) {
                if (dict[guess.charAt(i)-'0'] > 0) {
                    b++;
                    dict[guess.charAt(i)-'0']--;
                }
            }
            return Integer.toString(a) + 'A' + Integer.toString(b-a) + 'B';
        }
    }
}
