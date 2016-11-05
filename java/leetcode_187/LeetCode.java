package leetcode_187;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by pyan on 11/4/2016.
 */
public class LeetCode {
    public class Solution {
        public List<String> findRepeatedDnaSequences(String s) {
            List<String> res = new ArrayList<>();
            HashSet<String> resSet = new HashSet<>();
            if (s == null || s.length() <10) {
                return res;
            }
            HashSet<String> dict = new HashSet<>();
            for (int i=0; i<s.length()-9; i++) {
                String temp = s.substring(i, i+10);
                if (!dict.contains(temp)) {
                    dict.add(temp);
                } else {
                    resSet.add(temp);
                }
            }
            return new ArrayList<>(resSet);
        }
    }
}
