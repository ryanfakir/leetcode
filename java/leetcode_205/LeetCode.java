package leetcode_205;

import java.util.HashMap;

/**
 * Created by pyan on 10/1/2016.
 */
class LeetCode {
    public class Solution {
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> hm = new HashMap<Character, Character>();
            for (int i =0 ; i<t.length(); i++) {
                if (!hm.containsKey(s.charAt(i))) {
                    if (hm.containsValue(t.charAt(i))) {
                        return false;
                    }
                    hm.put(s.charAt(i), t.charAt(i));
                } else {
                    if ( hm.get(s.charAt(i)) != t.charAt(i)) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
