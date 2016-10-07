/**
 * Created by pyan on 10/6/2016.
 */
public class leetcode_168 {
    public class Solution {
        public String convertToTitle(int n) {
            StringBuilder s = new StringBuilder();
            int temp = n;
            while (temp != 0) {
                temp--;
                int digit = (temp)%26;
                temp /= 26;
                s.append((char)('A' + digit));
            }
            s.reverse();
            return s.toString();
        }
    }
}
