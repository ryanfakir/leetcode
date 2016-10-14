package leetcode_394;

/**
 * Created by pyan on 10/13/2016.
 */
public class LeetCode {
    public class Solution {
        int i = 0;

        public String decodeString(String s) {
            if (s.length() == 0) {
                return "";
            }
            return DFS(s, 0);
        }

        private String DFS(String s, int index) {
            if (index >= s.length()) {
                return "";
            }
            int num;
            StringBuilder numStr = new StringBuilder();
            StringBuilder letterStr = new StringBuilder();
            for (i = index; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    numStr.append(s.charAt(i));
                }
                if (Character.isLetter(s.charAt(i))) {
                    letterStr.append(s.charAt(i));
                }
                if (s.charAt(i) == '[') {
                    String str = DFS(s, i + 1);
                    for (int j = 0; j < Integer.valueOf(numStr.toString()); j++) {
                        letterStr.append(str);
                    }
                    numStr.delete(0, numStr.length());
                } else if (s.charAt(i) == ']') {
                    return letterStr.toString();
                }
            }
            return letterStr.toString();
        }
    }
}
