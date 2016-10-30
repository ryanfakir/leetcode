package leetcode_49;

import java.util.*;

/**
 * Created by pyan on 10/29/2016.
 */
public class LeetCode {
    public class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> res = new ArrayList<>();
            Map<String, List<String>> m = new HashMap<>();
            for (String ele: strs) {
                char[] arr = ele.toCharArray();
                Arrays.sort(arr);
                String key = new String(arr);
                List<String> value = m.getOrDefault(key, new ArrayList<>());
                value.add(ele);
                m.put(key, value);
            }
            for (List<String> ele: m.values()) {
                res.add(ele);
            }
            return res;
        }
    }
}
