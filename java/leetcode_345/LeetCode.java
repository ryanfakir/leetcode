package leetcode_345;

import java.util.HashSet;

/**
 * Created by pyan on 9/24/2016.
 */
class LeetCode {
    public class Solution {
        public String reverseVowels(String s) {
            if (s == null) {
                return null;
            }
            HashSet<Character> set = new HashSet<Character>();
            set.add('a');
            set.add('e');
            set.add('i');
            set.add('o');
            set.add('u');
            set.add('A');
            set.add('E');
            set.add('I');
            set.add('O');
            set.add('U');
            int i = 0;
            int j = s.length()-1;
            char[] arr = s.toCharArray();
            while (i < j) {
                if (set.contains(arr[i]) && set.contains(arr[j])) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                } else if (set.contains(arr[i])) {
                    j--;
                } else if (set.contains(arr[j])) {
                    i++;
                } else {
                    i++;
                    j--;
                }
            }
            return new String(arr);
        }
    }
}
