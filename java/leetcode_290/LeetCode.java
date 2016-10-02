package leetcode_290;

import java.util.HashMap;

/**
 * Created by pyan on 10/1/2016.
 */
class LeetCode {
    public class Solution {
        public boolean wordPattern(String pattern, String str) {
            String[] arr = str.split(" ");
            if (arr.length != pattern.length()) {
                return false;
            }
            HashMap<Character, String> chars = new HashMap<Character, String>();
            HashMap<String, Character> words = new HashMap<String, Character>();
            for (int i= 0 ; i<pattern.length(); i++) {
                if (chars.containsKey(pattern.charAt(i))) {
                    System.out.println(i);
                    if (!chars.get(pattern.charAt(i)).equals(arr[i])) {
                        return false;
                    }
                } else {
                    if (words.containsKey(arr[i])) {
                        return false;
                    } else {
                        chars.put(pattern.charAt(i), arr[i]);
                        words.put(arr[i], pattern.charAt(i));
                    }
                }
            }
            return true;
        }
    }
}
