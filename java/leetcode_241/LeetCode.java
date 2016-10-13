package leetcode_241;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyan on 10/12/2016.
 */
class LeetCode {
    public class Solution {
        public List<Integer> diffWaysToCompute(String input) {
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i<input.length(); i++) {
                char el = input.charAt(i);
                if (el == '+' || el == '-' || el == '*') {
                    List<Integer> left = diffWaysToCompute(input.substring(0, i));
                    List<Integer> right = diffWaysToCompute(input.substring(i+1));
                    for (Integer l : left) {
                        for (Integer r: right) {
                            switch(el){
                                case '+' :
                                    res.add(l + r);
                                    break;
                                case '-' :
                                    res.add(l - r);
                                    break;
                                case '*':
                                    res.add(l*r);
                                    break;
                            }
                        }
                    }
                }
            }
            if (res.size() == 0) {
                res.add(Integer.parseInt(input));
            }
            return res;
        }
    }
}
